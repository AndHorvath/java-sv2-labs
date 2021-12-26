package abstractclass.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtracterTest {

    Subtracter subtracter;

    @BeforeEach
    void setUp() {
        subtracter = new Subtracter();
    }

    @Test
    void getSolutionTest() {
        assertEquals(2, subtracter.getSolution(5, 3));
    }
}