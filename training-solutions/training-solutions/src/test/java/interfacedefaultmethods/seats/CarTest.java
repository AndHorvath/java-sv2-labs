package interfacedefaultmethods.seats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Ford", 4);
    }

    @Test
    void getBrandTest() {
        assertEquals("Ford", car.getBrand());
    }

    @Test
    void getNumberOfSeatsTest() {
        assertEquals(4, car.getNumberOfSeats());
    }
}