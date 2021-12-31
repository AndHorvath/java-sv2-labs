package interfacedependencyinversion.shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtraLargeBoxTest {

    ExtraLargeBox extraLargeBox;

    @BeforeEach
    void setUp() {
        extraLargeBox = new ExtraLargeBox();
    }

    @Test
    void getSizeTest() {
        assertEquals(Size.XL, extraLargeBox.getSize());
    }

    @Test
    void getPriceTest() {
        assertEquals(5000, extraLargeBox.getPrice());
    }
}