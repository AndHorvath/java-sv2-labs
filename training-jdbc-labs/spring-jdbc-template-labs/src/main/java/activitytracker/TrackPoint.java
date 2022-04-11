package activitytracker;

import java.time.LocalDate;

public class TrackPoint {

    // --- attributes ---------------------------------------------------------

    private Long id;
    private LocalDate time;
    private double latitude;
    private double longitude;

    // --- constructors -------------------------------------------------------

    public TrackPoint(LocalDate time, double latitude, double longitude) {
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // --- getters and setters ------------------------------------------------

    public Long getId() { return id; }
    public LocalDate getTime() { return time; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    public void setId(Long id) { this.id = id; }
}