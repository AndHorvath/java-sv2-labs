package clone.issuetracker;

import java.time.LocalDateTime;

public class Comment {

    // --- attributes ---------------------------------------------------------

    private String text;
    private LocalDateTime time;

    // --- constructors -------------------------------------------------------

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    public Comment(Comment other) {
        this.text = other.text;
        this.time = other.time;
    }

    // --- getters and setters ------------------------------------------------

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }
}