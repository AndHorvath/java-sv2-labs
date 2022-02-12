package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SaplingTest {

    Sapling sapling;

    @BeforeEach
    void setUp() {
        sapling = new Sapling("Tree", 100);
    }

    @Test
    void getSpeciesTest() {
        assertEquals("Tree", sapling.getSpecies());
    }

    @Test
    void getHeightTest() {
        assertEquals(100, sapling.getHeight());
    }

    @Test
    void setHeightTest() {
        sapling.setHeight(200);
        assertEquals(200, sapling.getHeight());
    }

    @Test
    void cutTest() {
        sapling.cut(50);
        assertEquals(50, sapling.getHeight());

        sapling.cut(100);
        assertEquals(50, sapling.getHeight());
    }
}