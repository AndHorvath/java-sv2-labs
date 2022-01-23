package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    BunchOfFlowers flowers;

    @BeforeEach
    void setUp() {
        flowers = new BunchOfFlowers();
    }

    @Test
    void getFlowersTest() {
        assertEquals(new LinkedList<>(), flowers.getFlowers());
    }

    @Test
    void addFlowersTest() {
        flowers.addFlower("flower");
        assertEquals(new LinkedList<>(List.of("flower")), flowers.getFlowers());
    }

    @Test
    void addFlowerInTheMiddleTest() {
        flowers.getFlowers().clear();
        flowers.addFlowerInTheMiddle("new flower");
        assertEquals(new LinkedList<>(List.of("new flower")) , flowers.getFlowers());

        flowers.getFlowers().clear();
        flowers.addFlower("flower");
        flowers.addFlowerInTheMiddle("new flower");
        assertEquals(new LinkedList<>(List.of("new flower", "flower", "new flower")), flowers.getFlowers());

        flowers.getFlowers().clear();
        flowers.addFlower("flower");
        flowers.addFlower("flower") ;
        flowers.addFlowerInTheMiddle("new flower");
        assertEquals(new LinkedList<>(List.of("flower", "new flower", "flower")), flowers.getFlowers());

        flowers.getFlowers().clear();
        flowers.addFlower("flower");
        flowers.addFlower("flower");
        flowers.addFlower("flower");
        flowers.addFlowerInTheMiddle("new flower");
        assertEquals(
            new LinkedList<>(List.of("flower", "new flower", "flower", "new flower", "flower")),
            flowers.getFlowers());
    }
}