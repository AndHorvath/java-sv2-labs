package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanCarryPassengersBehaviourTest {

    CanCarryPassengersBehaviour canCarryPassengersBehaviour;

    @BeforeEach
    void setUp() {
        canCarryPassengersBehaviour = new CanCarryPassengersBehaviour(100);
    }

    @Test
    void getPassengersTest() {
        assertEquals(0, canCarryPassengersBehaviour.getPassengers());
    }

    @Test
    void getMaxPassengerText() {
        assertEquals(100, canCarryPassengersBehaviour.getMaxPassengers());
    }

    @Test
    void loadPassengerTest() {
        assertEquals(20, canCarryPassengersBehaviour.loadPassenger(120));
        assertEquals(100, canCarryPassengersBehaviour.getPassengers());
    }
}