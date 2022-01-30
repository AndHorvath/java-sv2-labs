package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    Mountain mountain;
    Peak peakA;
    Peak peakB;

    @BeforeEach
    void setUp() {
        mountain = new Mountain(new int[] { 3000, 6000, 5000, 4000, 2000 });
        peakA = new Peak("Peak A", 2000);
        peakB = new Peak("Peak B", 1000);
    }

    @Test
    void getPeaksTest() {
        assertArrayEquals(new int[] { 2000, 3000, 4000, 5000, 6000 }, mountain.getPeaks());
    }

    @Test
    void searchPeakTest() {
        assertTrue(mountain.searchPeak(peakA));
        assertFalse(mountain.searchPeak(peakB));
    }
}