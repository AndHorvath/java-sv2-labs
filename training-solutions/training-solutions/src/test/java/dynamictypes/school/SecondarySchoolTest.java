package dynamictypes.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondarySchoolTest {

    SecondarySchool secondarySchool;

    @BeforeEach
    void setUp() {
        secondarySchool = new SecondarySchool("Secondary School", 4);
    }

    @Test
    void testToStringTest() {
        assertEquals("Secondary School: 4 years | SEC", secondarySchool.toString());
    }
}