package algorithmsmax.hill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    Hill hill;
    List<Integer> hills;

    @BeforeEach
    void setUp() {
        hill = new Hill();
        hills = Arrays.asList(
                2000, 3000, 2500, 3500, 3500, 2000
        );
    }

    @Test
    void getMaxTest() {
        int expectedResult = 3500;
        assertEquals(expectedResult, hill.getMax(hills));
    }
}