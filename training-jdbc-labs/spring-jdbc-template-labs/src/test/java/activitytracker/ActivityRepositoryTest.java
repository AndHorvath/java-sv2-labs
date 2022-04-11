package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityRepositoryTest {

    ActivityRepository activityRepository;
    MariaDbDataSource mariaDbDataSource;
    Flyway flyway;

    @BeforeEach
    void setUp() {
        mariaDbDataSource = new MariaDbDataSource();
        parametrizeDataSource(mariaDbDataSource);

        flyway = Flyway.configure().dataSource(mariaDbDataSource).load();
        flyway.clean();
        flyway.migrate();

        activityRepository = new ActivityRepository(mariaDbDataSource);
    }

    @Test
    void getJdbcTemplateTest() {
        assertNotNull(activityRepository.getJdbcTemplate());
    }

    @Test
    void saveActivityTest() {
        activityRepository.saveActivity(new Activity(
            LocalDateTime.of(2020, 10, 10, 20, 20), "Light training.", Type.BIKING));
        assertEquals(
            "Activity{id=1, startTime=2020-10-10T20:20, description='Light training.', type=BIKING}",
            activityRepository.findActivityById(1L).toString());
    }

    @Test
    void saveActivityAndGetIdTest() {
        fillActivities();
        assertEquals(
            3L,
            activityRepository.saveActivityAndGetId(new Activity(
                LocalDateTime.of(2020, 10, 20, 20, 10), "Second training.", Type.BIKING
            )));
    }

    @Test
    void saveAndGetActivityTest() {
        Activity activity = new Activity(LocalDateTime.of(2020, 10, 20, 20, 10), "Light training", Type.BIKING);
        assertNull(activity.getId());

        Long id = activityRepository.saveAndGetActivity(activity).getId();
        assertNotNull(activity.getId());
        assertEquals(activity.getId(), id);

        assertSame(activity, activityRepository.saveAndGetActivity(activity));
    }

    @Test
    void findActivityByIdTest() {
        fillActivities();
        assertEquals(
            "Activity{id=2, startTime=2020-10-20T10:20, description='Warming up.', type=HIKING}",
            activityRepository.findActivityById(2L).toString());
    }

    @Test
    void listActivitiesTest() {
        fillActivities();
        assertEquals(2, activityRepository.listActivities().size());

        assertEquals(
            "Activity{id=1, startTime=2020-10-10T20:20, description='Light training.', type=BIKING}",
            activityRepository.listActivities().get(0).toString());
        assertEquals(
            "Activity{id=2, startTime=2020-10-20T10:20, description='Warming up.', type=HIKING}",
            activityRepository.listActivities().get(1).toString());
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

    private void fillActivities() {
        activityRepository.saveActivity(new Activity(
            LocalDateTime.of(2020, 10, 10, 20, 20), "Light training.", Type.BIKING));
        activityRepository.saveActivity(new Activity(
            LocalDateTime.of(2020, 10, 20, 10, 20), "Warming up.", Type.HIKING));
    }
}