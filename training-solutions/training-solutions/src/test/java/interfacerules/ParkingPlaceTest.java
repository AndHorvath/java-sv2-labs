package interfacerules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingPlaceTest {

    ParkingPlace parkingPlace;
    double epsilon;

    @BeforeEach
    void setUp() {
        parkingPlace = new ParkingPlace();
        epsilon = Math.pow(10.0, -5.0);
    }

    @Test
    void gerLengthTest() {
        assertEquals(5.0, parkingPlace.gerLength(), epsilon);
    }

    @Test
    void getWidthTest() {
        assertEquals(2.2, parkingPlace.getWidth(), epsilon);
    }
}