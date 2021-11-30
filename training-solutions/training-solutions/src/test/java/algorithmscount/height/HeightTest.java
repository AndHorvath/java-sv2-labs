package algorithmscount.height;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    Height height;

    @BeforeEach
    void setUp() {
        height = new Height();
    }

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        List<Integer> heights = Arrays.asList(
                130, 140, 140, 150, 150, 160, 170
        );
        int lowerBound = 150;
        int expectedResult = 4;
        assertEquals(expectedResult, height.countChildrenWithHeightGreaterThan(heights, lowerBound));
    }
}