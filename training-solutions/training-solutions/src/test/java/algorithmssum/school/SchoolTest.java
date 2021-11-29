package algorithmssum.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school;

    @BeforeEach
    void setUp() {
        school = new School();
    }

    @Test
    void getNumberOfStudentsTest() {
        List<Integer> firstHundred = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            firstHundred.add(i);
        }
        int expectedSum = 5050;
        assertEquals(expectedSum, school.getNumberOfStudents(firstHundred));
    }
}