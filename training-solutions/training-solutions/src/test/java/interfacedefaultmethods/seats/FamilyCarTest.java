package interfacedefaultmethods.seats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FamilyCarTest {

    FamilyCar familyCar;

    @BeforeEach
    void setUp() {
        familyCar = new FamilyCar();
    }

    @Test
    void getNumberOfSeatsTest() {
        assertEquals(5, familyCar.getNumberOfSeats());
    }
}