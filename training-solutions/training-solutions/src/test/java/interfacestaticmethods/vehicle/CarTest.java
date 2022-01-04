package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car carA;
    Car carB;

    @BeforeEach
    void setUp() {
        carA = new Car(4);
        carB = new Car("Mazda", 4);
    }

    @Test
    void getBrandTest() {
        assertNull(carA.getBrand());
        assertEquals("Mazda", carB.getBrand());
    }

    @Test
    void getNumberOfWheelsTest() {
        assertEquals(4, carA.getNumberOfWheels());
        assertEquals(4, carB.getNumberOfWheels());
    }
}