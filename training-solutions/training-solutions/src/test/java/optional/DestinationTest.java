package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    Destination destination;

    @BeforeEach
    void setUp() {
        destination = new Destination("Destination", "Top destination.", 100);
    }

    @Test
    void getNameTest() {
        assertEquals("Destination", destination.getName());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Top destination.", destination.getDescription());
    }

    @Test
    void getKmFromHomeTest() {
        assertEquals(100, destination.getKmFromHome());
    }
}