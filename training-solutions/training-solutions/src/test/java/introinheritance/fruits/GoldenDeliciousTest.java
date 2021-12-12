package introinheritance.fruits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoldenDeliciousTest {

    GoldenDelicious goldenDelicious;

    @BeforeEach
    void setUp() {
        goldenDelicious = new GoldenDelicious();
    }

    @Test
    void getColourTest() {
        assertEquals(Colour.YELLOW, goldenDelicious.getColour());
    }
}