package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 111.111);
        String name = dragon.getName();

        assertEquals("Süsü", name);
        assertNotEquals("Sissy", name);
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 111.111);
        int numberOfHeads = dragon.getNumberOfHeads();

        assertEquals(1, numberOfHeads);
        assertTrue(numberOfHeads == 1);
        assertFalse(numberOfHeads == 7);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 111.111);
        double height = dragon.getHeight();

        assertEquals(111.111, height, 0.0001);
    }

    @Test
    void testNull() {
        Dragon dragonA = new Dragon("Süsü", 1, 111.111);
        Dragon dragonB = null;

        assertNull(dragonB);
        assertNotNull(dragonA);
    }

    @Test
    void testSameObjects() {
        Dragon dragonA = new Dragon("Süsü", 1, 111.111);
        Dragon dragonB = dragonA;

        assertSame(dragonA, dragonB);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragonA = new Dragon("Süsü", 1, 111.111);
        Dragon dragonB = new Dragon("Süsü", 1, 111.111);

        assertNotSame(dragonA, dragonB);
    }
}