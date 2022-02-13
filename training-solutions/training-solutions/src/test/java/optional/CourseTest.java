package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Beginner course", 1000, Level.BEGINNER);
    }

    @Test
    void getNameTest() {
        assertEquals("Beginner course", course.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, course.getPrice());
    }

    @Test
    void getLevelTest() {
        assertEquals(Level.BEGINNER, course.getLevel());
    }
}