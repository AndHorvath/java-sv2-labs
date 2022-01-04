package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle bicycle;
    Vehicle car;
    IllegalArgumentException exception;

    @Test
    void ofTest() {
        bicycle = Vehicle.of(2);
        car = Vehicle.of(4);

        assertEquals(Bicycle.class, bicycle.getClass());
        assertEquals(Car.class, car.getClass());

        assertEquals(2, ((Bicycle) bicycle).getNumberOfWheels());
        assertEquals(4, ((Car) car).getNumberOfWheels());
    }

    @Test
    void ofTextException() {
        exception = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(5));
        assertEquals("Vehicle must have either 2 or 4 wheels.", exception.getMessage());
    }
}