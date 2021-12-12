package dynamictypes.publictransport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TramTest {

    Tram tram;

    @BeforeEach
    void setUp() {
        tram = new Tram(3, 25.5d, 2);
    }

    @Test
    void getNumberOfTramcarsTest() {
        assertEquals(2, tram.getNumberOfTramcars());
    }
}