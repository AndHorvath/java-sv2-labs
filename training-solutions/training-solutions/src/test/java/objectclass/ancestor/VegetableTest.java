package objectclass.ancestor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VegetableTest {

    Vegetable vegetable;

    @BeforeEach
    void setUp() {
        vegetable = new Vegetable();
    }

    @Test
    void testToStringTest() {
        assertEquals("vegetable", vegetable.toString());
    }
}