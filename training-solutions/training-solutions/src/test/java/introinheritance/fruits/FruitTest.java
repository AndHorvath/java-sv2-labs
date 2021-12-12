package introinheritance.fruits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    Fruit fruit;

    @BeforeEach
    void setUp() {
        fruit = new Fruit();
    }

    @Test
    void getNameTest() {
        assertNull(fruit.getName());
    }

    @Test
    void setNameTest() {
        fruit.setName("Fruit");
        assertEquals("Fruit", fruit.getName());
    }

    @Test
    void getWeightTest() {
        assertEquals(0d, fruit.getWeight(), setEpsilon());
    }

    @Test
    void setWeightTest() {
        fruit.setWeight(0.5d);
        assertEquals(0.5d, fruit.getWeight(), setEpsilon());
    }

    // --- private methods ----------------------------------------------------

    private double setEpsilon() {
        return Math.pow(10d, -5d);
    }
}