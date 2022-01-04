package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {

    Bicycle bicycle;

    @BeforeEach
    void setUp() {
        bicycle = new Bicycle(2);
    }

    @Test
    void getNumberOfWheelsTest() {
        assertEquals(2, bicycle.getNumberOfWheels());
    }
}