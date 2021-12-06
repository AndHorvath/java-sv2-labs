package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    Position position;
    Position other;

    @BeforeEach
    void setUp() {
        position = new Position(1d, 2d);
    }

    @Test
    void getPosXTest() {
        assertEquals(1d, position.getPosX());
    }

    @Test
    void getPosYTest() {
        assertEquals(2d, position.getPosY());
    }

    @Test
    void distanceFromTest() {
        other = new Position(4d, 6d);
        assertEquals(5d, position.distanceFrom(other));
    }

    @Test
    void distanceFromTestWithNull() {
        other = null;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> position.distanceFrom(other));
        assertEquals("Position cannot be null.", exception.getMessage());
    }
}