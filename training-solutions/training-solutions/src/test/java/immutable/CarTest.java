package immutable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Mazda", "CX3", 2020);
    }

    @Test
    void getBrandTest() {
        assertEquals("Mazda", car.getBrand());
    }

    @Test
    void getTypeTest() {
        assertEquals("CX3", car.getType());
    }

    @Test
    void getYearOfProductionTest() {
        assertEquals(2020, car.getYearOfProduction());
    }

    @Test
    void createWithInvalidParametersTest() {
        IllegalArgumentException exception;
        String expectedEmptyMessage = "Brand name cannot be empty.";

        exception = assertThrows(
                IllegalArgumentException.class, () -> new Car(null, "CX3", 2020));
        assertEquals(expectedEmptyMessage, exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class, () -> new Car(" ", "CX3", 2020));
        assertEquals(expectedEmptyMessage, exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class, () -> new Car("Mazda", "CX3", 2100));
        assertEquals("Year of production cannot be in the future.", exception.getMessage());
    }
}