package introinheritance.fruits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrapeTest {

    Grape grape;

    @BeforeEach
    void setUp() {
        grape = new Grape();
    }

    @Test
    void getTypeTest() {
        assertNull(grape.getType());
    }

    @Test
    void setTypeTest() {
        grape.setType("Cabernet");
        assertEquals("Cabernet", grape.getType());
    }
}