package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    Trooper trooper;
    Trooper other;
    Position target;

    @BeforeEach
    void setUp() {
        trooper = new Trooper("Jeff Doe");
    }

    @Test
    void createTestWithEmpty() {
        IllegalArgumentException exception;
        String message = "Name cannot be empty.";

        exception = assertThrows(IllegalArgumentException.class, () -> new Trooper(null));
        assertEquals(message, exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> new Trooper(" "));
        assertEquals(message, exception.getMessage());
    }

    @Test
    void getNameTest() {
        assertEquals("Jeff Doe", trooper.getName());
    }

    @Test
    void getPositionTest() {
        assertEquals(0d, trooper.getPosition().getPosX());
        assertEquals(0d, trooper.getPosition().getPosY());
    }

    @Test
    void changePositionTest() {
        target = new Position(1d, 2d);
        trooper.changePosition(target);

        assertEquals(1d, trooper.getPosition().getPosX());
        assertEquals(2d, trooper.getPosition().getPosY());
    }

    @Test
    void changePositionTestWithNull() {
        target = null;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> trooper.changePosition(target));
        assertEquals("Target cannot be null.", exception.getMessage());
    }

    @Test
    void distanceFromTest() {
        target = new Position(3d, 4d);
        assertEquals(5d, trooper.distanceFrom(target));
    }

    @Test
    void distanceFromTestWithNull() {
        target = null;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> trooper.distanceFrom(target));
        assertEquals("Target cannot be null.", exception.getMessage());
    }

    @Test
    void isCloserThanTest() {
        target = new Position(1d, 0d);
        trooper.changePosition(target);

        target = new Position(8d, 0d);
        other = new Trooper("Judd Doe");
        other.changePosition(target);

        target = new Position(4d, 4d);
        assertTrue(trooper.isCloserThan(other, target));
    }

    @Test
    void isCloserThanTestWithNull() {
        IllegalArgumentException exception;
        String message = "Neither other nor target can be null.";

        target = new Position(4d, 4d);
        exception = assertThrows(IllegalArgumentException.class, () -> trooper.isCloserThan(null, target));
        assertEquals(message, exception.getMessage());

        other = new Trooper("Judd Doe");
        exception = assertThrows(IllegalArgumentException.class, () -> trooper.isCloserThan(other, null));
        assertEquals(message, exception.getMessage());
    }
}