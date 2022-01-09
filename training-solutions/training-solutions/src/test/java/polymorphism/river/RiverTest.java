package polymorphism.river;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River river;

    @BeforeEach
    void setUp() {
        river = new River("river", 100) { };
    }

    @Test
    void getNameTest() {
        assertEquals("river", river.getName());
    }

    @Test
    void getLengthTest() {
        assertEquals(100, river.getLength());
    }
}