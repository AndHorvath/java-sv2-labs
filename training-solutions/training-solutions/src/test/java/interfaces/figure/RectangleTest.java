package interfaces.figure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(5, 4);
    }

    @Test
    void getSideATest() {
        assertEquals(5, rectangle.getSideA());
    }

    @Test
    void getSideBTest() {
        assertEquals(4, rectangle.getSideB());
    }

    @Test
    void getAreaTest() {
        assertEquals(20, rectangle.getArea());
    }
}