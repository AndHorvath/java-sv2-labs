package lambdaoptional.club;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    Club clubA;
    Club clubB;

    Member memberA;
    Member memberB;
    Member memberC;
    Member memberD;

    double epsilon;

    @BeforeEach
    void setUp() {
        clubA = new Club();
        clubB = new Club();

        memberA = new Member("MemberA", List.of("skillA", "skillB", "skillC"), Gender.FEMALE);
        memberB = new Member("MemberB", List.of("skillC", "skillD"), Gender.FEMALE);
        memberC = new Member("MemberC", List.of("skillE"), Gender.MALE);
        memberD = new Member("MemberD", List.of("skillA", "skillC", "skillE", "skillF"), Gender.MALE);

        clubA.addMember(memberA);
        clubA.addMember(memberB);
        clubA.addMember(memberC);
        clubA.addMember(memberD);

        epsilon = Math.pow(10, -5);
    }

    @Test
    void testGetMembers() {
        assertEquals(List.of(memberA, memberB, memberC, memberD), clubA.getMembers());
    }

    @Test
    void testAddMember() {
        Member memberE = new Member("MemberE", List.of("skillG"), Gender.FEMALE);
        clubA.addMember(memberE);

        assertEquals(List.of(memberA, memberB, memberC, memberD, memberE), clubA.getMembers());
    }

    @Test
    void testFindFirst() {
        assertTrue(
            clubA.findFirst(member -> member.getGender() == Gender.FEMALE).isPresent());
        assertEquals(
            memberC,
            clubA.findFirst(member -> member.getSkills().contains("skillE")).orElseGet(this::getDummyMember));

        assertFalse(
            clubA.findFirst(member -> member.getName().equals("MemberE")).isPresent());
        assertEquals(
            "",
            clubA.findFirst(member -> member.getSkills().size() > 4).orElseGet(this::getDummyMember).getName());
    }

    @Test
    void testAverageNumberOfSkills() {
        assertTrue(clubA.averageNumberOfSkills().isPresent());
        assertEquals(2.5, clubA.averageNumberOfSkills().orElse(0.0), epsilon);

        assertFalse(clubB.averageNumberOfSkills().isPresent());
        assertEquals(0.0, clubB.averageNumberOfSkills().orElse(0.0), epsilon);
    }

    // --- private methods ----------------------------------------------------

    private Member getDummyMember() {
        return new Member("", List.of(), Gender.MALE);
    }
}