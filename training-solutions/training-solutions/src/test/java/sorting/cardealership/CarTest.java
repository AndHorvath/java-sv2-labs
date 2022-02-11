package sorting.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Car", 2000, 1000);
    }

    @Test
    void getBrandTest() {
        assertEquals("Car", car.getBrand());
    }

    @Test
    void getYearOfConstructionTest() {
        assertEquals(2000, car.getYearOfConstruction());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, car.getPrice());
    }
}