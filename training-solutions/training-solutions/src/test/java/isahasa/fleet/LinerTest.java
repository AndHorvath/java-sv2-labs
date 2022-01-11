package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinerTest {

    Liner liner;

    @BeforeEach
    void setUp() {
        liner = new Liner(100);
    }

    @Test
    void getCanCarryPassengersTest() {
        assertEquals(
            100, ((CanCarryPassengersBehaviour) liner.getCanCarryPassengers()).getMaxPassengers());
    }

    @Test
    void loadPassengerTest() {
        assertEquals(20, liner.loadPassenger(120));
        assertEquals(100, liner.getPassengers());
    }

    @Test
    void getPassengersTest() {
        assertEquals(0, liner.getPassengers());
    }
}