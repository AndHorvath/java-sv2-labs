package virtualmethod.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    FerryBoat ferryBoat;

    Car car;
    Van vanA;
    Van vanB;

    @BeforeEach
    void setUp() {
        ferryBoat = new FerryBoat(2000);

        car = new Car(1100, 3);
        vanA = new Van(1150, 1, 200);
        vanB = new Van(1150, 1, 300);
    }

    @Test
    void getCarTest() {
        assertNull(ferryBoat.getCar());
    }

    @Test
    void canCarryTest() {
        assertTrue(ferryBoat.canCarry(car));
        assertTrue(ferryBoat.canCarry(vanA));
        assertFalse(ferryBoat.canCarry(vanB));
    }

    @Test
    void loadTest() {
        assertTrue(ferryBoat.load(car));
        assertEquals(car, ferryBoat.getCar());

        assertTrue(ferryBoat.load(vanA));
        assertEquals(vanA, ferryBoat.getCar());

        assertFalse(ferryBoat.load(vanB));
        assertEquals(vanA, ferryBoat.getCar());
    }

    @Test
    void getGrossLoadTest() {
        assertEquals(2075, ferryBoat.getGrossLoad());

        ferryBoat.load(car);
        assertEquals(3475, ferryBoat.getGrossLoad());

        ferryBoat.load(vanA);
        assertEquals(3575, ferryBoat.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        ferryBoat.load(car);
        assertEquals(
            "FerryBoat{car=Car{numberOfPassengers=3, vehicleWeight=1100}}",
            ferryBoat.toString());

        ferryBoat.load(vanA);
        assertEquals(
            "FerryBoat{car=Van{caroWeight=200, numberOfPassengers=1, vehicleWeight=1150}}",
            ferryBoat.toString());
    }
}