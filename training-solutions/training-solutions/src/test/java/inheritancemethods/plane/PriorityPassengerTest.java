package inheritancemethods.plane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PriorityPassengerTest {

    PriorityPassenger priorityPassenger;

    @BeforeEach
    void setUp() {
        priorityPassenger = new PriorityPassenger("Jack Doe", 40_000, 25);
    }

    @Test
    void getPercentTest() {
        assertEquals(25, priorityPassenger.getPercent());
    }

    @Test
    void getPriceOfPlaneTicketTest() {
        assertEquals(50_000, priorityPassenger.getPriceOfPlaneTicket());
    }

    @Test
    void testToStringTest() {
        assertEquals("Jack Doe 25% 50000", priorityPassenger.toString());
    }
}