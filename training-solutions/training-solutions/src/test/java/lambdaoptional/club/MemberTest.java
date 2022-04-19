package lambdaoptional.club;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member member;

    @BeforeEach
    void setUp() {
        member = new Member("MemberA", List.of("skillA", "skillB"), Gender.FEMALE);
    }

    @Test
    void testGetName() {
        assertEquals("MemberA", member.getName());
    }

    @Test
    void testGetSkills() {
        assertEquals(List.of("skillA", "skillB"), member.getSkills());
    }

    @Test
    void testGetGender() {
        assertEquals(Gender.FEMALE, member.getGender());
    }
}