package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Joan Doe", "11 Main Str. 10000 Middletown");
    }

    @Test
    void getNameTest() {
        String expectedName = "Joan Doe";
        assertEquals(expectedName, student.getName());
    }

    @Test
    void getAddressTest() {
        String expectedAddress = "11 Main Str. 10000 Middletown";
        assertEquals(expectedAddress, student.getAddress());
    }
}