package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TrainingCompanyTest {

    TrainingCompany trainingCompany;
    TrainingCompany other;
    Course courseA;
    Course courseB;
    Course courseC;
    Throwable exception;

    @BeforeEach
    void setUp() {
        courseA = new Course("Beginner course", 1000, Level.BEGINNER);
        courseB = new Course("Advanced course", 2000, Level.ADVANCED);
        courseC = new Course("Expert course", 3000, Level.EXPERT);

        trainingCompany = new TrainingCompany(
            new ArrayList<>(List.of(courseA, courseB, courseC))
        );
    }

    @Test
    void getCoursesTest() {
        assertEquals(
            new ArrayList<>(List.of(courseA, courseB, courseC)),
            trainingCompany.getCourses()
        );
    }

    @Test
    void getCheaperCourseTest() {
        assertEquals(courseB, trainingCompany.getCheaperCourse(2000));
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> trainingCompany.getCheaperCourse(100)
        );
        assertEquals("No such course.", exception.getMessage());
    }

    @Test
    void getPriceOfCourseWithGivenNameAndLevelTest() {
        assertEquals(
            1000,
            trainingCompany.getPriceOfCourseWithGivenNameAndLevel("Beginner course", Level.BEGINNER)
        );
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> trainingCompany.getPriceOfCourseWithGivenNameAndLevel("Advanced course", Level.BEGINNER)
        );
        assertEquals("No such course.", exception.getMessage());
    }

    @Test
    void getNameOfCourseWithGivenLevelTest() {
        assertEquals("Expert course", trainingCompany.getNameOfCourseWithGivenLevel(Level.EXPERT));

        other = new TrainingCompany(new ArrayList<>(List.of(courseA, courseB)));
        assertEquals(
            "Sorry, there is no course at this level.",
            other.getNameOfCourseWithGivenLevel(Level.EXPERT)
        );
    }
}