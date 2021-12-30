package interfaces.figure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle;
    double epsilon;

    @BeforeEach
    void setUp() {
        circle = new Circle(2);
        epsilon = Math.pow(10.0, -5.0);
    }

    @Test
    void getRadiusTest() {
        assertEquals(2, circle.getRadius());
    }

    @Test
    void getAreaTest() {
        assertEquals(4 * Math.PI, circle.getArea(), epsilon);
    }
}