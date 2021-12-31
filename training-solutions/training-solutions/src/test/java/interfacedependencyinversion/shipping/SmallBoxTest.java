package interfacedependencyinversion.shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallBoxTest {

    SmallBox smallBox;

    @BeforeEach
    void setUp() {
        smallBox = new SmallBox();
    }

    @Test
    void getSizeTest() {
        assertEquals(Size.S, smallBox.getSize());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, smallBox.getPrice());
    }
}