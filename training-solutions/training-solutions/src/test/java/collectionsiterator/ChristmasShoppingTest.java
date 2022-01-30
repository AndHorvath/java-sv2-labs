package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    ChristmasShopping christmasShopping;
    List<ChristmasPresent> presents;

    @BeforeEach
    void setUp() {
        presents = new ArrayList<>(List.of(
            new ChristmasPresent("Present A", "Good present.", 1000),
            new ChristmasPresent("Present B", "Nice present.", 2000),
            new ChristmasPresent("Present C", "Cool present.", 3000),
            new ChristmasPresent("Present D", "Great present.", 4000)
        ));
        christmasShopping = new ChristmasShopping(presents);
    }

    @Test
    void getPresentsTest() {
        assertEquals(presents, christmasShopping.getPresents());
    }

    @Test
    void addNewPresentTest() {
        christmasShopping.addNewPresent(new ChristmasPresent("Present E", "Wonderful present.", 5000));
        assertEquals(5, christmasShopping.getPresents().size());
        assertEquals("Present E", christmasShopping.getPresents().get(4).getName());
        assertEquals("Wonderful present.", christmasShopping.getPresents().get(4).getDescription());
        assertEquals(5000, christmasShopping.getPresents().get(4).getPrice());
    }

    @Test
    void removeTooExpensivePresentsTest() {
        christmasShopping.removeTooExpensivePresents(2000);
        assertEquals(2, christmasShopping.getPresents().size());
        assertEquals("Present A", christmasShopping.getPresents().get(0).getName());
        assertEquals("Nice present.", christmasShopping.getPresents().get(1).getDescription());
    }
}