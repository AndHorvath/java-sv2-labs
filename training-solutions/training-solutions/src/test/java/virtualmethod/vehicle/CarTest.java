package virtualmethod.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(1200, 3);
    }

    @Test
    void getNumberOfPassengersTest() {
        assertEquals(3, car.getNumberOfPassengers());
    }

    @Test
    void getGrossLoadTest() {
        assertEquals(1500, car.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Car{numberOfPassengers=3, vehicleWeight=1200}", car.toString());
    }
}