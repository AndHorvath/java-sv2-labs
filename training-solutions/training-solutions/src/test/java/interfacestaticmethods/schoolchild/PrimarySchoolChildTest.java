package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    PrimarySchoolChild childA;
    PrimarySchoolChild childB;
    IllegalArgumentException exception;

    @Test
    void ofTest() {
        childA = PrimarySchoolChild.of(8);
        childB = PrimarySchoolChild.of(12);

        assertEquals(LowerClassSchoolChild.class, childA.getClass());
        assertEquals(UpperClassSchoolChild.class, childB.getClass());

        assertEquals(8, ((LowerClassSchoolChild) childA).getAge());
        assertEquals(12, ((UpperClassSchoolChild) childB).getAge());
    }

    @Test
    void ofTestException() {
        exception = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(5));
        assertEquals("Age must be a number between 6 and 14.", exception.getMessage());
    }
}