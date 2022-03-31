package activitytracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {

    // --- attributes ---------------------------------------------------------

    private Long id;
    private LocalDateTime startTime;
    private String description;
    private Type type;
    private List<TrackPoint> trackPoints;

    // --- constructors -------------------------------------------------------

    public Activity(LocalDateTime startTime, String description, Type type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
        this.trackPoints = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public Long getId() { return id; }
    public LocalDateTime getStartTime() { return startTime; }
    public String getDescription() { return description; }
    public Type getType() { return type; }
    public List<TrackPoint> getTrackPoints() { return trackPoints; }

    public void setId(Long id) { this.id = id; }

    // --- public methods -----------------------------------------------------

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public void addTrackPoints(List<TrackPoint> trackPoints) {
        this.trackPoints.addAll(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
            "id=" + id +
            ", startTime=" + startTime +
            ", description='" + description + "'" +
            ", type=" + type +
            "}";
    }
}