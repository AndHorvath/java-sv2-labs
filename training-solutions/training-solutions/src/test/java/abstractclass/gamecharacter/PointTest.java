package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;

    @BeforeEach
    void setUp() {
        point = new Point(3, 2);
    }

    @Test
    void getXTest() {
        assertEquals(3, point.getX());
    }

    @Test
    void getYTest() {
        assertEquals(2, point.getY());
    }

    @Test
    void getDistanceTest() {
        assertEquals(5, point.getDistance(new Point(7, 5)));
    }
}