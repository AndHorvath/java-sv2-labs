package lambdaintro.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;
    double epsilon = Math.pow(10, -5);

    @BeforeEach
    void setUp() {
        car = new Car("Brand B", "Type T", 1000, 4.21);
    }

    @Test
    void testGetBrand() {
        assertEquals("Brand B", car.getBrand());
    }

    @Test
    void testGetType() {
        assertEquals("Type T", car.getType());
    }

    @Test
    void testGetPrice() {
        assertEquals(1000, car.getPrice());
    }

    @Test
    void testGetLength() {
        assertEquals(4.21, car.getLength(), epsilon);
    }
}