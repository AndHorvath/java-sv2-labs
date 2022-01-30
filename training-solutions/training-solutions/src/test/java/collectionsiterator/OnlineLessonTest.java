package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class OnlineLessonTest {

    OnlineLesson onlineLesson;

    @BeforeEach
    void setUp() {
        onlineLesson = new OnlineLesson("Lesson", "Teacher", LocalDateTime.of(2022, 1, 20, 10, 0));
    }

    @Test
    void getTitleTest() {
        assertEquals("Lesson", onlineLesson.getTitle());
    }

    @Test
    void getTeacherTest() {
        assertEquals("Teacher", onlineLesson.getTeacher());
    }

    @Test
    void getStartTimeTest() {
        assertEquals(LocalDateTime.of(2022, 1, 20, 10, 0), onlineLesson.getStartTime());
    }
}