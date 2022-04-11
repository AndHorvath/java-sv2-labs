package activitytracker;

public class ActivitiesTrackPointsService {

    // --- attributes ---------------------------------------------------------

    private ActivityRepository activityRepository;
    private TrackPointRepository trackPointRepository;

    // --- constructors -------------------------------------------------------

    public ActivitiesTrackPointsService(
        ActivityRepository activityRepository, TrackPointRepository trackPointRepository) {

        this.activityRepository = activityRepository;
        this.trackPointRepository = trackPointRepository;
    }

    // --- getters and setters ------------------------------------------------

    public ActivityRepository getActivityRepository() { return activityRepository; }

    public TrackPointRepository getTrackPointRepository() { return trackPointRepository; }

    // --- public methods -----------------------------------------------------

    public void saveActivityWithTrackPoints(Activity activity) {
        Activity activityWithId = activityRepository.saveAndGetActivity(activity);
        saveTrackPointsForActivity(activityWithId);
    }

    // --- private methods ----------------------------------------------------

    private void saveTrackPointsForActivity(Activity activity) {
        for (TrackPoint trackPoint : activity.getTrackPoints()) {
            trackPointRepository.saveTrackPoint(
                trackPoint.getTime(), trackPoint.getLatitude(), trackPoint.getLongitude(), activity.getId());
        }
    }
}