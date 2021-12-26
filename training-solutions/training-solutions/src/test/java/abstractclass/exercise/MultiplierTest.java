package abstractclass.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    Multiplier multiplier;

    @BeforeEach
    void setUp() {
        multiplier = new Multiplier();
    }

    @Test
    void getSolutionTest() {
        assertEquals(15, multiplier.getSolution(5, 3));
    }
}