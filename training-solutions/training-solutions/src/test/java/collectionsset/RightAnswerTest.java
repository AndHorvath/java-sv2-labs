package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightAnswerTest {

    RightAnswer rightAnswer;
    RightAnswer other;

    @BeforeEach
    void setUp() {
        rightAnswer = new RightAnswer("Player A");
    }

    @Test
    void getPlayerTest() {
        assertEquals("Player A", rightAnswer.getPlayer());
    }

    @Test
    void testEqualsTest() {
        other = new RightAnswer("Player A");
        assertEquals(rightAnswer, other);

        other = new RightAnswer("Player B");
        assertNotEquals(rightAnswer, other);
    }

    @Test
    void testHashCodeTest() {
        other = new RightAnswer("Player A");
        assertEquals(rightAnswer.hashCode(), other.hashCode());
    }
}