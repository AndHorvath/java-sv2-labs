package interfaces.figure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(5, 4);
    }

    @Test
    void getLengthOfSideTest() {
        assertEquals(5, triangle.getLengthOfSide());
    }

    @Test
    void getHeightTest() {
        assertEquals(4, triangle.getHeight());
    }

    @Test
    void getAreaTest() {
        assertEquals(10, triangle.getArea());
    }
}