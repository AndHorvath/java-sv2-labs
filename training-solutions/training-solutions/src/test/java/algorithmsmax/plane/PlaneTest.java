package algorithmsmax.plane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    Plane plane;
    String map;

    @BeforeEach
    void setUp() {
        plane = new Plane();
        map =
                "10000000111110000000000001111111111000010000010000" +
                "10000011111111000010100000000011111000000000000000" +
                "0100000001000000000000111111000000000100000000000011";
    }

    @Test
    void getLongestOceanTest() {
        int expectedResult = 16;
        assertEquals(expectedResult, plane.getLongestOcean(map));
    }
}