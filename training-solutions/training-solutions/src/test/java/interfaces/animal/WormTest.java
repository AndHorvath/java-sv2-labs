package interfaces.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WormTest {

    Worm worm;

    @BeforeEach
    void setUp() {
        worm = new Worm();
    }

    @Test
    void getNumberOfLegsTest() {
        assertEquals(0, worm.getNumberOfLegs());
    }

    @Test
    void getNameTest() {
        assertEquals("Worm", worm.getName());
    }
}