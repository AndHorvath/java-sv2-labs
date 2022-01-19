package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;
    SimpleTime begin;

    @BeforeEach
    void setUp() {
        begin = new SimpleTime(5, 3);
        course = new Course("course", begin);
    }

    @Test
    void getNameTest() {
        assertEquals("course", course.getName());
    }

    @Test
    void getBeginTest() {
        assertEquals(begin, course.getBegin());
    }

    @Test
    void toStringTest() {
        assertEquals("05:03 : course", course.toString());
    }
}