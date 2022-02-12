package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    // --- attributes ---------------------------------------------------------

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments;

    // --- constructors -------------------------------------------------------

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.comments = new ArrayList<>();
    }

    public Issue(Issue other, CopyMode copyMode) {
        this.name = other.name;
        this.time = other.time;
        this.status = other.status;
        this.comments = createComments(other, copyMode);
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public LocalDateTime getTime() { return time; }
    public Status getStatus() { return status; }
    public List<Comment> getComments() { return comments; }

    public void setComments(List<Comment> comments) { this.comments = comments; }

    // --- private methods ----------------------------------------------------

    private List<Comment> createComments(Issue issue, CopyMode copyMode) {
        List<Comment> comments = new ArrayList<>();
        if (copyMode == CopyMode.WITH_COMMENTS) {
            for (Comment comment : issue.getComments()) {
                comments.add(new Comment(comment));
            }
        }
        return comments;
    }
}