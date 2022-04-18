package lambdaintro.flat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {

    Flat flat;
    double epsilon;

    @BeforeEach
    void setUp() {
        flat = new Flat("123 Central Avenue, Newtown 12121", 50.5, 100_000);
        epsilon = Math.pow(10, -5);
    }

    @Test
    void testGetAddress() {
        assertEquals("123 Central Avenue, Newtown 12121", flat.getAddress());
    }

    @Test
    void testGetArea() {
        assertEquals(50.5, flat.getArea(), epsilon);
    }

    @Test
    void testGetPrice() {
        assertEquals(100_000, flat.getPrice());
    }
}