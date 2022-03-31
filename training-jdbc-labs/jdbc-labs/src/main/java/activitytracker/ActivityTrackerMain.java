package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource mariaDbDataSource = new MariaDbDataSource();
        new ActivityTrackerMain().parameterizeDataSource(mariaDbDataSource);

        Activity activityA = new Activity(LocalDateTime.of(2020, 10, 10, 20, 20), "Light training.", Type.BIKING);
        Activity activityB = new Activity(LocalDateTime.of(2020, 10, 20, 10, 20), "Warming up.", Type.HIKING);
        ActivityRepository activityRepository = new ActivityRepository(mariaDbDataSource);

        activityRepository.saveActivity(activityA);
        activityRepository.saveActivity(activityB);

        List<Activity> activities = activityRepository.listActivities();
        for (Activity activity : activities) {
            System.out.println(activityRepository.findActivityById(activity.getId()));
        }
    }

    // --- private methods ----------------------------------------------------

    private void parameterizeDataSource(MariaDbDataSource mariaDbDataSource) {
        try {
            mariaDbDataSource.setUrl("jdbc:mariadb://localhost:3306/activity_tracker?useUnicode=true");
            mariaDbDataSource.setUser("root");
            mariaDbDataSource.setPassword("root");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot reach database.", sqlException);
        }
    }
}