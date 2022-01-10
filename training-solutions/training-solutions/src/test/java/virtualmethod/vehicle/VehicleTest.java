package virtualmethod.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle(1000);
    }

    @Test
    void getVehicleWeightTest() {
        assertEquals(1000, vehicle.getVehicleWeight());
    }

    @Test
    void getGrossLoadTest() {
        assertEquals(1075, vehicle.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Vehicle{vehicleWeight=1000}", vehicle.toString());
    }
}