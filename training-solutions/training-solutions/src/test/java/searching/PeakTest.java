package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PeakTest {

    Peak peak;

    @BeforeEach
    void setUp() {
        peak = new Peak("Peak", 1000);
    }

    @Test
    void getNameTest() {
        assertEquals("Peak", peak.getName());
    }

    @Test
    void getHeightTest() {
        assertEquals(1000, peak.getHeight());
    }
}