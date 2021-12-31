package interfacedependencyinversion.shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediumBoxTest {

    MediumBox mediumBox;

    @BeforeEach
    void setUp() {
        mediumBox = new MediumBox();
    }

    @Test
    void getSizeTest() {
        assertEquals(Size.M, mediumBox.getSize());
    }

    @Test
    void getPriceTest() {
        assertEquals(2000, mediumBox.getPrice());
    }
}