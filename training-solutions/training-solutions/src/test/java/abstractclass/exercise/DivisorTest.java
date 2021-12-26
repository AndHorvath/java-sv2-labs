package abstractclass.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisorTest {

    Divisor divisor;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        divisor = new Divisor();
    }

    @Test
    void getSolutionTest() {
        assertEquals(1, divisor.getSolution(5, 3));
        assertEquals(0, divisor.getSolution(0, 3));

        exception = assertThrows(IllegalArgumentException.class, () -> divisor.getSolution(5, 0));
        assertEquals("No division by zero.", exception.getMessage());
    }
}