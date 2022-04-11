package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivitiesTrackPointsServiceTest {

    MariaDbDataSource mariaDbDataSource;
    Flyway flyway;

    ActivityRepository activityRepository;
    TrackPointRepository trackPointRepository;
    ActivitiesTrackPointsService activitiesTrackPointsService;

    List<TrackPoint> trackPoints;
    Activity activity;
    double epsilon;

    @BeforeEach
    void setUp() {
        mariaDbDataSource = new MariaDbDataSource();
        parametrizeDataSource(mariaDbDataSource);

        flyway = Flyway.configure().dataSource(mariaDbDataSource).load();
        flyway.clean();
        flyway.migrate();

        activityRepository = new ActivityRepository(mariaDbDataSource);
        trackPointRepository = new TrackPointRepository(mariaDbDataSource);
        activitiesTrackPointsService = new ActivitiesTrackPointsService(activityRepository, trackPointRepository);

        epsilon = Math.pow(10, -5);
    }

    @Test
    void getActivityRepositoryTest() {
        assertEquals(activityRepository, activitiesTrackPointsService.getActivityRepository());
    }

    @Test
    void getTrackPointRepositoryTest() {
        assertEquals(trackPointRepository, activitiesTrackPointsService.getTrackPointRepository());
    }

    @Test
    void saveActivityWithTrackPointsTest() {
        trackPoints = List.of(
            new TrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05),
            new TrackPoint(LocalDate.of(2020, 10, 20), 47.6, 19.15)
        );
        activity = new Activity(LocalDateTime.of(2020, 10, 20, 10, 20), "Light training.", Type.BIKING);
        activity.addTrackPoints(trackPoints);
        activitiesTrackPointsService.saveActivityWithTrackPoints(activity);

        assertEquals(activity.toString(), activityRepository.findActivityById(1L).toString());

        assertEquals(2, trackPointRepository.getAllTrackPoints().size());

        assertEquals(1L, trackPointRepository.getAllTrackPoints().get(0).getId());
        assertEquals(LocalDate.of(2020, 10, 20), trackPointRepository.getAllTrackPoints().get(0).getTime());
        assertEquals(47.5, trackPointRepository.getAllTrackPoints().get(0).getLatitude(), epsilon);
        assertEquals(19.05, trackPointRepository.getAllTrackPoints().get(0).getLongitude(), epsilon);
        assertEquals(activity.getId(), trackPointRepository.getActivityIdByTrackPointId(1L));

        assertEquals(2L, trackPointRepository.getAllTrackPoints().get(1).getId());
        assertEquals(LocalDate.of(2020, 10, 20), trackPointRepository.getAllTrackPoints().get(1).getTime());
        assertEquals(47.6, trackPointRepository.getAllTrackPoints().get(1).getLatitude(), epsilon);
        assertEquals(19.15, trackPointRepository.getAllTrackPoints().get(1).getLongitude(), epsilon);
        assertEquals(activity.getId(), trackPointRepository.getActivityIdByTrackPointId(2L));
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