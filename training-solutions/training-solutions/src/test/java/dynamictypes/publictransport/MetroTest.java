package dynamictypes.publictransport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MetroTest {

    Metro metro;

    @BeforeEach
    void setUp() {
        metro = new Metro(4, 30.5, 15);
    }

    @Test
    void getNumberOfStationsTest() {
        assertEquals(15, metro.getNumberOfStations());
    }
}