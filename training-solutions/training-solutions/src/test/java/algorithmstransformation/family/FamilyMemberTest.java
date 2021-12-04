package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    FamilyMember familyMember;

    @BeforeEach
    void setUp() {
        familyMember = new FamilyMember("Jeff Doe", 30);
    }

    @Test
    void getNameTest() {
        String expectedResult = "Jeff Doe";
        assertEquals(expectedResult, familyMember.getName());
    }

    @Test
    void getAgeTest() {
        int expectedResult = 30;
        assertEquals(expectedResult, familyMember.getAge());
    }
}