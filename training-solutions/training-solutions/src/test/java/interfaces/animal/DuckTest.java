package interfaces.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    Duck duck;

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @Test
    void getNumberOfLegsTest() {
        assertEquals(2, duck.getNumberOfLegs());
    }

    @Test
    void getNameTest() {
        assertEquals("Duck", duck.getName());
    }
}