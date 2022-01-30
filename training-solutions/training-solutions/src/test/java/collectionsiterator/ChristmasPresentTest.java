package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChristmasPresentTest {

    ChristmasPresent christmasPresent;

    @BeforeEach
    void setUp() {
        christmasPresent = new ChristmasPresent("Present", "Good present.", 1000);
    }

    @Test
    void getNameTest() {
        assertEquals("Present", christmasPresent.getName());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Good present.", christmasPresent.getDescription());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, christmasPresent.getPrice());
    }
}