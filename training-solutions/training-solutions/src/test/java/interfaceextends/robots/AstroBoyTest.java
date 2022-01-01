package interfaceextends.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AstroBoyTest {

    AstroBoy astroBoy;
    Point position;
    Point positionTarget;
    Point positionExceptional;
    String exceptionMessage;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        position = new Point(1, 2, 0);
        astroBoy = new AstroBoy(position);

        positionTarget = new Point(8, 9, 0);
        positionExceptional = new Point(1, 2, 3);
        exceptionMessage = "Movements have to start and end in the plane.";
    }

    @Test
    void constructTestExceptional() {
        exception = assertThrows(
            IllegalArgumentException.class, () -> new AstroBoy(positionExceptional));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void getPositionTest() {
        assertEquals(position, astroBoy.getPosition());
    }

    @Test
    void getAngleTest() {
        assertEquals(0, astroBoy.getAngle());
    }

    @Test
    void getPathTest() {
        assertEquals(1, astroBoy.getPath().size());
        assertEquals(position, astroBoy.getPath().get(0));
    }

    @Test
    void liftToTest() {
        astroBoy.liftTo(3);
        assertEquals(2, astroBoy.getPath().size());
        assertEquals(1, astroBoy.getPath().get(1).getX());
        assertEquals(2, astroBoy.getPath().get(1).getY());
        assertEquals(3, astroBoy.getPath().get(1).getZ());
    }

    @Test
    void moveToTest() {
        astroBoy.moveTo(positionTarget);
        assertEquals(2, astroBoy.getPath().size());
        assertEquals(positionTarget, astroBoy.getPath().get(1));

        exception = assertThrows(
            IllegalArgumentException.class, () -> astroBoy.moveTo(positionExceptional));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void fastMoveToTest() {
        astroBoy.fastMoveTo(positionTarget);
        assertEquals(4, astroBoy.getPath().size());

        assertEquals(position, astroBoy.getPath().get(0));

        assertEquals(1, astroBoy.getPath().get(1).getX());
        assertEquals(2, astroBoy.getPath().get(1).getY());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(1).getZ());

        assertEquals(8, astroBoy.getPath().get(2).getX());
        assertEquals(9, astroBoy.getPath().get(2).getY());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(2).getZ());

        assertEquals(positionTarget.getX(), astroBoy.getPath().get(3).getX());
        assertEquals(positionTarget.getY(), astroBoy.getPath().get(3).getY());
        assertEquals(positionTarget.getZ(), astroBoy.getPath().get(3).getZ());

        exception = assertThrows(
            IllegalArgumentException.class, () -> astroBoy.fastMoveTo(positionExceptional));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void rotateTest() {
    }
}