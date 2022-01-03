package interfacedefaultmethods.seats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SportsCarTest {

    SportsCar sportsCar;

    @BeforeEach
    void setUp() {
        sportsCar = new SportsCar();
    }

    @Test
    void getNumberOfSeatsTest() {
        assertEquals(2, sportsCar.getNumberOfSeats());
    }
}