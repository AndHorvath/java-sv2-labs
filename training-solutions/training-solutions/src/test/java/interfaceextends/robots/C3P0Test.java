package interfaceextends.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C3P0Test {

    C3P0 c3P0;
    Point position;
    Point positionToMoveTo;
    Point positionAboveThePlane;
    IllegalArgumentException exception;
    String exceptionMessage;

    @BeforeEach
    void setUp() {
        position = new Point(1, 2, 0);
        positionToMoveTo = new Point(3, 4, 0);
        positionAboveThePlane = new Point(0, 0, 1);
        exceptionMessage = "C3P0 only moves in the plane.";

        c3P0 = new C3P0(position);
    }

    @Test
    void constructTestExceptional() {
        exception = assertThrows(
            IllegalArgumentException.class, () -> new C3P0(positionAboveThePlane));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void getPositionTest() {
        assertEquals(position, c3P0.getPosition());
    }

    @Test
    void getAngleTest() {
        assertEquals(0, c3P0.getAngle());
    }

    @Test
    void getPathTest() {
        assertEquals(1, c3P0.getPath().size());
        assertEquals(position, c3P0.getPath().get(0));
    }

    @Test
    void moveToTest() {
        c3P0.moveTo(positionToMoveTo);
        assertEquals(positionToMoveTo, c3P0.getPosition());
        assertEquals(2, c3P0.getPath().size());
        assertEquals(positionToMoveTo, c3P0.getPath().get(1));

        exception = assertThrows(
            IllegalArgumentException.class, () -> c3P0.moveTo(positionAboveThePlane));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void fastMoveToTest() {
        c3P0.fastMoveTo(positionToMoveTo);
        assertEquals(positionToMoveTo, c3P0.getPosition());
        assertEquals(2, c3P0.getPath().size());
        assertEquals(positionToMoveTo, c3P0.getPath().get(1));

        exception = assertThrows(
            IllegalArgumentException.class, () -> c3P0.fastMoveTo(positionAboveThePlane));
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    void rotateTest() {
        c3P0.rotate(10);
        assertEquals(10, c3P0.getAngle());

        c3P0.rotate(10);
        assertEquals(20, c3P0.getAngle());
    }
}