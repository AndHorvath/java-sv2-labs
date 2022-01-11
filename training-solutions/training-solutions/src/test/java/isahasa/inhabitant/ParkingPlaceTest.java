package isahasa.inhabitant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingPlaceTest {

    ParkingPlace parkingPlace;

    @BeforeEach
    void setUp() {
        parkingPlace = new ParkingPlace(12);
    }

    @Test
    void getNumberTest() {
        assertEquals(12, parkingPlace.getNumber());
    }
}