package interfacedefaultmethods.seats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    FamilyCar familyCar;
    SportsCar sportsCar;
    Car car;

    @BeforeEach
    void setUp() {
        familyCar = new FamilyCar();
        sportsCar = new SportsCar();
        car = new Car("Ford", 4);
    }

    @Test
    void getNumberOfSeatsTest() {
        assertEquals(5, familyCar.getNumberOfSeats());
        assertEquals(2, sportsCar.getNumberOfSeats());
        assertEquals(4, car.getNumberOfSeats());
    }
}