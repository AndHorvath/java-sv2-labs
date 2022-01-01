package interfaceextends.polygon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    Polygon polygon;
    double epsilon;

    @BeforeEach
    void setUp() {
        polygon = new Polygon(10.0, 5);
        epsilon = Math.pow(10.0, -5.0);
    }

    @Test
    void getLengthOfSideTest() {
        assertEquals(10.0, polygon.getLengthOfSide(), epsilon);
    }

    @Test
    void getNumberOfVerticesTest() {
        assertEquals(5, polygon.getNumberOfVertices());
    }

    @Test
    void getPerimeterTest() {
        assertEquals(50.0, polygon.getPerimeter(), epsilon);
    }

    @Test
    void getNumberOfDiagonalsFromOneVertexTest() {
        assertEquals(4, polygon.getNumberOfDiagonalsFromOneVertex());
    }

    @Test
    void getNumberOfAllDiagonalsTest() {
        assertEquals(10, polygon.getNumberOfAllDiagonals());
    }
}