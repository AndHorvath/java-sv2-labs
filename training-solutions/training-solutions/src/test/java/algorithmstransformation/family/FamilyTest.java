package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void setUp() {
        family = new Family();
        family.addFamilyMember(new FamilyMember("John Doe", 50));
        family.addFamilyMember(new FamilyMember("Jane Doe", 40));
        family.addFamilyMember(new FamilyMember("Jenny Jane Doe", 20));
    }

    @Test
    void getFamilyMembersTest() {
        assertEquals(3, family.getFamilyMembers().size());
        assertEquals("Jane Doe", family.getFamilyMembers().get(1).getName());
        assertEquals(20, family.getFamilyMembers().get(2).getAge());
    }

    @Test
    void addFamilyMemberTest() {
        family.addFamilyMember(new FamilyMember("Jake Doe", 70));
        assertEquals(4, family.getFamilyMembers().size());
        assertEquals("Jake Doe", family.getFamilyMembers().get(3).getName());
        assertEquals(70, family.getFamilyMembers().get(3).getAge());
    }

    @Test
    void getAgesOfFamilyMembersWithNameGivenTest() {
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(40, 20));
        assertEquals(expectedResult, family.getAgesOfFamilyMembersWithNameGiven("Jane"));
    }
}