package inheritancemethods.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;
    double epsilon;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        car = new Car(5d, 30d, 50d);
        epsilon = Math.pow(10d, -5d);
    }

    @Test
    void getFuelRateTest() {
        assertEquals(5d, car.getFuelRate(), epsilon);
    }

    @Test
    void getFuelTest() {
        assertEquals(30d, car.getFuel(), epsilon);
    }

    @Test
    void getTankCapacityTest() {
        assertEquals(50d, car.getTankCapacity(), epsilon);
    }

    @Test
    void modifyFuelAmountTest() {
        car.modifyFuelAmount(10d);
        assertEquals(40d, car.getFuel(), epsilon);

        exception = assertThrows(IllegalArgumentException.class, () -> car.modifyFuelAmount(20d));
        assertEquals("Amount to be filled exceeds capacity.", exception.getMessage());
    }

    @Test
    void driveTest() {
        car.drive(200);
        assertEquals(20d, car.getFuel(), epsilon);

        exception = assertThrows(IllegalArgumentException.class, () -> car.drive(400));
        assertEquals("Not enough fuel for given distance.", exception.getMessage());
    }

    @Test
    void calculateRefillAmountTest() {
        car.drive(200);
        assertEquals(30d, car.calculateRefillAmount(), epsilon);
    }

    @Test
    void validateFuelTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> car.validateFuel(2d, 1d));
        assertEquals("Amount to be filled exceeds capacity.", exception.getMessage());
    }

    @Test
    void validateDistanceToDriveTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> car.validateDistanceToDrive(600));
        assertEquals("Not enough fuel for given distance.", exception.getMessage());
    }

    @Test
    void distanceCanBeDrivenTest() {
        assertEquals(600d, car.distanceCanBeDriven(), epsilon);
    }
}