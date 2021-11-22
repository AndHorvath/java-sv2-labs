package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank;

    @BeforeEach
    void setUp() {
        tank = new Tank();
        tank.modifyAngle(50);
    }

    @Test
    void getAngleTest() {
        tank.modifyAngle(20);
        assertEquals(70, tank.getAngle());
    }

    @Test
    void modifyAngleTestHappyPath() {
        tank.modifyAngle(-110);
        assertEquals(-60, tank.getAngle());
    }

    @Test
    void modifyAngleTextExceptionalPath() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> tank.modifyAngle(40));
        assertEquals("Position must be between -80 and 80 degree.", exception.getMessage());
    }
}