package dynamictypes.publictransport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicVehicleTest {

    PublicVehicle publicVehicle;

    @BeforeEach
    void setUp() {
        publicVehicle = new PublicVehicle(1, 2.5d);
    }

    @Test
    void getLineNumberTest() {
        assertEquals(1, publicVehicle.getLineNumber());
    }

    @Test
    void getLengthTest() {
        assertEquals(2.5d, publicVehicle.getLength(), Math.pow(10d, -5d));
    }
}