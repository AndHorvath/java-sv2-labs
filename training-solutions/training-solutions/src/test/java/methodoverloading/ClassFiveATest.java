package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA;
    List<String> students;

    @BeforeEach
    void setUp() {
        students = Arrays.asList(
                "John Doe", "Jack Doe", "Jane Doe", "Jeff Doe", "Jill Doe",
                "Joan Doe", "Judd Doe", "Joey Doe", "Judy Doe", "Jenn Doe");
        classFiveA = new ClassFiveA(new ArrayList<>(students));
    }

    @Test
    void getStudentsTest() {
        assertEquals(students, classFiveA.getStudents());
    }

    @Test
    void getTodayReferringStudentIntTest() {
        assertEquals("Jeff Doe", classFiveA.getTodayReferringStudent(3));
    }

    @Test
    void GetTodayReferringStudentNumberTest() {
        assertEquals("Jeff Doe", classFiveA.getTodayReferringStudent(Number.THREE));
    }

    @Test
    void GetTodayReferringStudentStringTest() {
        assertEquals("Jeff Doe", classFiveA.getTodayReferringStudent("three"));
    }
}