package algorithmsdecision.towns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    Town town;
    List<Integer> inhabitantsList;
    int upperBoundA;
    int upperBoundB;

    @BeforeEach
    void setUp() {
        town = new Town();
        inhabitantsList = Arrays.asList(
                30_000, 40_000, 50_000, 60_000
        );
        upperBoundA = 50_000;
        upperBoundB = 20_000;
    }

    @Test
    void containsFewerInhabitantsTest() {
        assertTrue(town.containsFewerInhabitants(inhabitantsList, upperBoundA));
        assertFalse(town.containsFewerInhabitants(inhabitantsList, upperBoundB));
    }
}