package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {

    // --- attributes ---------------------------------------------------------

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    // --- constructors -------------------------------------------------------

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public LocalDateTime getStartDateTime() { return startDateTime; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    // --- public methods -----------------------------------------------------

    public void start() {
        startDateTime = LocalDateTime.now();
    }
}