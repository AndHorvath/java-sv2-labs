package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrackPointRepositoryTest {

    TrackPointRepository trackPointRepository;
    MariaDbDataSource mariaDbDataSource;
    Flyway flyway;

    List<TrackPoint> trackPoints;
    double epsilon;

    @BeforeEach
    void setUp() {
        mariaDbDataSource = new MariaDbDataSource();
        parametrizeDataSource(mariaDbDataSource);

        flyway = Flyway.configure().dataSource(mariaDbDataSource).load();
        flyway.clean();
        flyway.migrate();

        trackPointRepository = new TrackPointRepository(mariaDbDataSource);

        epsilon = Math.pow(10, -5);
    }

    @Test
    void getJdbcTemplateTest() {
        assertNotNull(trackPointRepository.getJdbcTemplate());
    }

    @Test
    void saveTrackPointTest() {
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05, 5L);

        assertEquals(1L, trackPointRepository.getTrackPointById(1L).getId());
        assertEquals(LocalDate.of(2020, 10, 20), trackPointRepository.getTrackPointById(1L).getTime());
        assertEquals(47.5, trackPointRepository.getTrackPointById(1L).getLatitude(), epsilon);
        assertEquals(19.05, trackPointRepository.getTrackPointById(1L).getLongitude(), epsilon);

        assertEquals(5L, trackPointRepository.getActivityIdByTrackPointId(1L));
    }

    @Test
    void getTrackPointByIdTest() {
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05, 5L);
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 10), 47.5, 21.58, 3L);

        assertEquals(2L, trackPointRepository.getTrackPointById(2L).getId());
        assertEquals(LocalDate.of(2020, 10, 10), trackPointRepository.getTrackPointById(2L).getTime());
        assertEquals(47.5, trackPointRepository.getTrackPointById(2L).getLatitude(), epsilon);
        assertEquals(21.58, trackPointRepository.getTrackPointById(2L).getLongitude(), epsilon);
    }

    @Test
    void getActivityIdByTrackPointIdTest() {
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 10), 47.5, 21.58, 3L);

        assertEquals(3L, trackPointRepository.getActivityIdByTrackPointId(1L));
    }

    @Test
    void getAllTrackPointsTest() {
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05, 5L);
        trackPointRepository.saveTrackPoint(LocalDate.of(2020, 10, 10), 47.5, 21.58, 5L);
        assertEquals(2, trackPointRepository.getAllTrackPoints().size());

        assertEquals(1L, trackPointRepository.getAllTrackPoints().get(0).getId());
        assertEquals(LocalDate.of(2020, 10, 20), trackPointRepository.getAllTrackPoints().get(0).getTime());
        assertEquals(47.5, trackPointRepository.getAllTrackPoints().get(0).getLatitude(), epsilon);
        assertEquals(19.05, trackPointRepository.getAllTrackPoints().get(0).getLongitude(), epsilon);

        assertEquals(2L, trackPointRepository.getAllTrackPoints().get(1).getId());
        assertEquals(LocalDate.of(2020, 10, 10), trackPointRepository.getAllTrackPoints().get(1).getTime());
        assertEquals(47.5, trackPointRepository.getAllTrackPoints().get(1).getLatitude(), epsilon);
        assertEquals(21.58, trackPointRepository.getAllTrackPoints().get(1).getLongitude(), epsilon);
    }

    // --- private methods ----------------------------------------------------

    private void parametrizeDataSource(MariaDbDataSource mariaDbDataSource) {
        try {
            mariaDbDataSource.setUrl("jdbc:mariadb://localhost:3306/activity_tracker_test?useUnicode=true");
            mariaDbDataSource.setUser("root");
            mariaDbDataSource.setPassword("root");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot reach database.", sqlException);
        }
    }
}