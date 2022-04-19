package lambdaoptional.costume;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostumeTest {

    Costume costume;

    @BeforeEach
    void setUp() {
        costume = new Costume("Costume", Size.M, 100);
    }

    @Test
    void testGetDescription() {
        assertEquals("Costume", costume.getDescription());
    }

    @Test
    void testGetSize() {
        assertEquals(Size.M, costume.getSize());
    }

    @Test
    void testGetPrice() {
        assertEquals(100, costume.getPrice());
    }
}