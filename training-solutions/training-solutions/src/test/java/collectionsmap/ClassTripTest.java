package collectionsmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip;

    @BeforeEach
    void setUp() {
        classTrip = new ClassTrip();
    }

    @Test
    void getInpaymentsTest() {
        assertTrue(classTrip.getInpayments().isEmpty());
    }

    @Test
    void loadInpaymentsTest() {
        classTrip.loadInpayments(Path.of("src/test/resources/inpayments.txt"));
        Map<String, Integer> expected = new HashMap<>(Map.ofEntries(
            Map.entry("Kiss József", 12_500),
            Map.entry("Nagy Béla", 5_000),
            Map.entry("Szép Virág", 15_000)
        ));
        assertEquals(expected, classTrip.getInpayments());
    }
}