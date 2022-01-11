package isahasa.inhabitant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InhabitantTest {

    Inhabitant inhabitant;
    ParkingPlace parkingPlace;

    @BeforeEach
    void setUp() {
        parkingPlace = new ParkingPlace(12);
        inhabitant = new Inhabitant("John Doe", parkingPlace);
    }

    @Test
    void getNameTest() {
        assertEquals("John Doe", inhabitant.getName());
    }

    @Test
    void getParkingPlaceTest() {
        assertEquals(parkingPlace, inhabitant.getParkingPlace());
    }

    @Test
    void changeParkingPlaceTest() {
        inhabitant.changeParkingPlace(21);
        assertEquals(21, inhabitant.getParkingPlace().getNumber());
    }
}