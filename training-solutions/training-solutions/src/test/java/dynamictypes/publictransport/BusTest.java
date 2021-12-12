package dynamictypes.publictransport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    Bus bus;

    @BeforeEach
    void setUp() {
        bus = new Bus(2, 15.5d, "MAN");
    }

    @Test
    void getBrandTest() {
        assertEquals("MAN", bus.getBrand());
    }
}