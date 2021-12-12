package dynamictypes.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school;

    @BeforeEach
    void setUp() {
        school = new School("School", 12);
    }

    @Test
    void getNameTest() {
        assertEquals("School", school.getName());
    }

    @Test
    void getNumberOfYearsTest() {
        assertEquals(12, school.getNumberOfYears());
    }

    @Test
    void testToStringTest() {
        assertEquals("School: 12 years", school.toString());
    }
}