package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Student", 180);
    }

    @Test
    void getNameTest() {
        assertEquals("Student", student.getName());
    }

    @Test
    void getHeightTest() {
        assertEquals(180, student.getHeight());
    }
}