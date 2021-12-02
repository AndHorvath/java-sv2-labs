package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal("camel", 4);
    }

    @Test
    void getNameTest() {
        String expectedName = "camel";
        assertEquals(expectedName, animal.getName());
    }

    @Test
    void getNumberOfLegsTest() {
        int expectedNumberOfLegs = 4;
        assertEquals(expectedNumberOfLegs, animal.getNumberOfLegs());
    }
}