package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {

    // --- attributes ---------------------------------------------------------

    private String title;
    private String teacher;
    private LocalDateTime startTime;

    // --- constructors -------------------------------------------------------

    public OnlineLesson(String title, String teacher, LocalDateTime startTime) {
        this.title = title;
        this.teacher = teacher;
        this.startTime = startTime;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }
    public String getTeacher() { return teacher; }
    public LocalDateTime getStartTime() { return startTime; }
}