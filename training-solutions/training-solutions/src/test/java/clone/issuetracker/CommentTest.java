package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    Comment comment;
    Comment other;

    @BeforeEach
    void setUp() {
        comment = new Comment("Text.", LocalDateTime.of(2020, 10, 20, 10, 0));
    }

    @Test
    void copyConstructorTest() {
        other = new Comment(comment);

        assertEquals(comment.getText(), other.getText());
        assertEquals(comment.getTime(), other.getTime());

        assertNotSame(comment, other);
    }

    @Test
    void getTextTest() {
        assertEquals("Text.", comment.getText());
    }

    @Test
    void setTextTest() {
        comment.setText("New text.");
        assertEquals("New text.", comment.getText());
    }

    @Test
    void getTimeTest() {
        assertEquals(LocalDateTime.of(2020, 10, 20, 10, 0), comment.getTime());
    }

    @Test
    void setTimeTest() {
        comment.setTime(LocalDateTime.of(2020, 10, 20, 20, 0));
        assertEquals(LocalDateTime.of(2020, 10, 20, 20, 0), comment.getTime());
    }
}