package methodpass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OneTest {

    One one;

    @BeforeEach
    void setUp() {
        one = new One();
    }

    @Test
    void addOneTest() {
        assertEquals(2, one.addOne(1));
    }
}