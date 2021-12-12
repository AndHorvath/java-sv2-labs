package dynamictypes.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;

    @BeforeEach
    void setUp() {
        primarySchool = new PrimarySchool("Primary School", 8);
    }

    @Test
    void testToStringTest() {
        assertEquals("Primary School: 8 years | PRIM", primarySchool.toString());
    }
}