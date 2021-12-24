package inheritancemethods.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    Jeep jeep;
    double epsilon;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        jeep = new Jeep(10d, 30d, 50d, 20d, 10d);
        epsilon = Math.pow(10d, -5d);
    }

    @Test
    void getExtraCapacityTest() {
        assertEquals(20d, jeep.getExtraCapacity(), epsilon);
    }

    @Test
    void getExtraFuelTest() {
        assertEquals(10d, jeep.getExtraFuel(), epsilon);
    }

    @Test
    void modifyFuelAmountTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> jeep.modifyFuelAmount(40d));
        assertEquals("Amount to be filled exceeds capacity.", exception.getMessage());

        jeep.modifyFuelAmount(30d);
        assertEquals(50d, jeep.getFuel(), epsilon);
        assertEquals(20d, jeep.getExtraFuel(), epsilon);
    }

    @Test
    void driveTest() {
        jeep.drive(300);
        assertEquals(0d, jeep.getExtraFuel(), epsilon);
        assertEquals(10d, jeep.getFuel(), epsilon);

        exception = assertThrows(IllegalArgumentException.class, () -> jeep.drive(200));
        assertEquals("Not enough fuel for given distance.", exception.getMessage());
    }

    @Test
    void calculateRefillAmountTest() {
        jeep.drive(200);
        assertEquals(50d, jeep.calculateRefillAmount(), epsilon);
    }

    @Test
    void distanceCanBeDrivenTest() {
        assertEquals(400d, jeep.distanceCanBeDriven(), epsilon);
    }
}