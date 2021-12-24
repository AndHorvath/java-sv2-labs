package inheritancemethods.plane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger("John Doe", 40_000);
    }

    @Test
    void getNameTest() {
        assertEquals("John Doe", passenger.getName());
    }

    @Test
    void getPriceOfPlaneTicketTest() {
        assertEquals(40_000, passenger.getPriceOfPlaneTicket());
    }

    @Test
    void testToStringTest() {
        assertEquals("John Doe 40000", passenger.toString());
    }
}