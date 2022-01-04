package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowerClassSchoolChildTest {

    LowerClassSchoolChild childA;
    LowerClassSchoolChild childB;

    @BeforeEach
    void setUp() {
        childA = new LowerClassSchoolChild(8);
        childB = new LowerClassSchoolChild("John Doe", 9);
    }

    @Test
    void getNameTest() {
        assertNull(childA.getName());
        assertEquals("John Doe", childB.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(8, childA.getAge());
        assertEquals(9, childB.getAge());
    }
}