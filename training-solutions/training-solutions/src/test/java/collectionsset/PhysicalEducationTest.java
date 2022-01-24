package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalEducationTest {

    PhysicalEducation physicalEducation;
    List<Student> students;

    @BeforeEach
    void setUp() {
        physicalEducation = new PhysicalEducation();
        students = new ArrayList<>(List.of(
            new Student("Student", 170), new Student("Student", 165), new Student("Student", 175),
            new Student("Student", 175), new Student("Student", 165), new Student("Student", 170)
        ));
    }

    @Test
    void getOrderInLessonsTest() {
        assertEquals(new TreeSet<>(Set.of(165, 170, 175)), physicalEducation.getOrderInLessons(students));
        assertEquals("[165, 170, 175]", physicalEducation.getOrderInLessons(students).toString());
    }
}