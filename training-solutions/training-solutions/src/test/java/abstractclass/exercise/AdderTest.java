package abstractclass.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    Adder adder;

    @BeforeEach
    void setUp() {
        adder = new Adder();
    }

    @Test
    void getSolutionTest() {
        assertEquals(8, adder.getSolution(5, 3));
    }
}