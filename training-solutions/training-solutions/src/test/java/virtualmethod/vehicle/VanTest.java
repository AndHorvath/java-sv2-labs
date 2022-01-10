package virtualmethod.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    Van van;

    @BeforeEach
    void setUp() {
        van = new Van(1350, 1, 500);
    }

    @Test
    void getCaroWeightTest() {
        assertEquals(500, van.getCaroWeight());
    }

    @Test
    void getGrossLoadTest() {
        assertEquals(2000, van.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Van{caroWeight=500, numberOfPassengers=1, vehicleWeight=1350}", van.toString());
    }
}