package inheritancemethods.plane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstClassPassengerTest {

    FirstClassPassenger firstClassPassenger;

    @BeforeEach
    void setUp() {
        firstClassPassenger = new FirstClassPassenger("Jane Doe", 40_000, 25);
    }

    @Test
    void getExtraChargeTest() {
        assertEquals(20_000, firstClassPassenger.getExtraCharge());
    }

    @Test
    void getPriceOfPlaneTicketTest() {
        assertEquals(70_000, firstClassPassenger.getPriceOfPlaneTicket());
    }

    @Test
    void testToStringTest() {
        assertEquals("Jane Doe 25% 20000 70000", firstClassPassenger.toString());
    }
}