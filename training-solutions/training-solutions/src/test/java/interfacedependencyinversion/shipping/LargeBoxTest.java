package interfacedependencyinversion.shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargeBoxTest {

    LargeBox largeBox;

    @BeforeEach
    void setUp() {
        largeBox = new LargeBox();
    }

    @Test
    void getSizeTest() {
        assertEquals(Size.L, largeBox.getSize());
    }

    @Test
    void getPriceTest() {
        assertEquals(3000, largeBox.getPrice());
    }
}