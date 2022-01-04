package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UpperClassSchoolChildTest {

    UpperClassSchoolChild childA;
    UpperClassSchoolChild childB;

    @BeforeEach
    void setUp() {
        childA = new UpperClassSchoolChild(12);
        childB = new UpperClassSchoolChild("Jane Doe", 13);
    }

    @Test
    void getNameTest() {
        assertNull(childA.getName());
        assertEquals("Jane Doe", childB.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(12, childA.getAge());
        assertEquals(13, childB.getAge());
    }
}