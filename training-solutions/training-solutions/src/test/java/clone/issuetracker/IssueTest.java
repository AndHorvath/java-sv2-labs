package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    Issue issue;
    Issue other;
    LocalDateTime time;
    List<Comment> comments;

    @BeforeEach
    void setUp() {
        time = LocalDateTime.of(2020, 10, 20, 10, 0);
        issue = new Issue("Name", time, Status.IN_PROGRESS);

        comments = new ArrayList<>(List.of(
            new Comment("Text A", time.plusHours(1)),
            new Comment("Text B", time.plusHours(2))
        ));
    }

    @Test
    void copyConstructorTest() {
        issue.setComments(comments);

        other = new Issue(issue, CopyMode.WITHOUT_COMMENTS);
        assertEquals(issue.getName(), other.getName());
        assertEquals(issue.getTime(), other.getTime());
        assertEquals(issue.getStatus(), other.getStatus());
        assertEquals(new ArrayList<>(), other.getComments());
        assertNotSame(issue, other);

        other = new Issue(issue, CopyMode.WITH_COMMENTS);
        assertEquals(issue.getName(), other.getName());
        assertEquals(issue.getTime(), other.getTime());
        assertEquals(issue.getStatus(), other.getStatus());
        assertEquals(issue.getComments().size(), other.getComments().size());
        assertEquals(issue.getComments().get(0).getText(), other.getComments().get(0).getText());
        assertEquals(issue.getComments().get(0).getTime(), other.getComments().get(0).getTime());
        assertEquals(issue.getComments().get(1).getText(), other.getComments().get(1).getText());
        assertEquals(issue.getComments().get(1).getTime(), other.getComments().get(1).getTime());
        assertNotSame(issue, other);
        assertNotSame(issue.getComments(), other.getComments());

        other.getComments().add(new Comment("Text C", time.plusHours(3)));
        other.getComments().get(0).setText("New text A");
        other.getComments().get(1).setTime(time.plusHours(2).plusMinutes(30));
        assertNotEquals(issue.getComments().size(), other.getComments().size());
        assertNotEquals(issue.getComments().get(0).getText(), other.getComments().get(0).getText());
        assertNotEquals(issue.getComments().get(1).getTime(), other.getComments().get(1).getTime());
    }

    @Test
    void getNameTest() {
        assertEquals("Name", issue.getName());
    }

    @Test
    void getTimeTest() {
        assertEquals(time, issue.getTime());
    }

    @Test
    void getStatusTest() {
        assertEquals(Status.IN_PROGRESS, issue.getStatus());
    }

    @Test
    void getCommentsTest() {
        assertEquals(new ArrayList<>(), issue.getComments());
    }

    @Test
    void setCommentsTest() {
        issue.setComments(comments);
        assertEquals(comments, issue.getComments());
    }
}