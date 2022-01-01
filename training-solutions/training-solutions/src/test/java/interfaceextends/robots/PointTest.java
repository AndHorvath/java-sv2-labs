package interfaceextends.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;

    @BeforeEach
    void setUp() {
        point = new Point(1, 2, 3);
    }

    @Test
    void getXTest() {
        assertEquals(1, point.getX());
    }

    @Test
    void getYTest() {
        assertEquals(2, point.getY());
    }

    @Test
    void getZTest() {
        assertEquals(3, point.getZ());
    }
}