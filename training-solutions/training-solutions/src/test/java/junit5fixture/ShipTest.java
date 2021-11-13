package junit5fixture;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void constructShip() {
        ship = new Ship("MyShip", 2000, 9.63);
    }

    @Test
    void testName() {
        assertEquals("MyShip", ship.getName());
        assertNotEquals("MyBoat", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(2000, ship.getYearOfConstruction());
        assertTrue(2000 == ship.getYearOfConstruction());
        assertFalse(2001 == ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(9.63, ship.getLength(), 0.0001);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("MyShip", 2000, 9.63);

        assertNotSame(ship, anotherShip);
    }
}