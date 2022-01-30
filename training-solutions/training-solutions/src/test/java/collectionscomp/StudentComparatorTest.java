package collectionscomp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentComparatorTest {

    StudentComparator studentComparator;
    Student studentA;
    Student studentB;

    @BeforeEach
    void setUp() {
        studentComparator = new StudentComparator();
        studentA = new Student("Student A", 180);
        studentB = new Student("Student B", 190);
    }

    @Test
    void compareTest() {
        assertTrue(studentComparator.compare(studentA, studentB) < 0);
    }
}