package introinheritance.fruits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StarkingTest {

    Starking starking;

    @BeforeEach
    void setUp() {
        starking = new Starking();
    }

    @Test
    void getColourTest() {
        assertEquals(Colour.RED, starking.getColour());
    }
}