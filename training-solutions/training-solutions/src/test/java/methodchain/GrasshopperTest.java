package methodchain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper;

    @BeforeEach
    void setUp() {
        grasshopper = new Grasshopper(0);
    }

    @Test
    void getPositionTest() {
        assertEquals(0, grasshopper.getPosition());
    }

    @Test
    void hopOnceTest() {
        grasshopper.hopOnce(Direction.POSITIVE);
        assertEquals(1, grasshopper.getPosition());

        grasshopper.hopOnce(Direction.NEGATIVE);
        assertEquals(0, grasshopper.getPosition());
    }

    @Test
    void moveFromZeroToThreeWithFiveHopsTest() {
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}