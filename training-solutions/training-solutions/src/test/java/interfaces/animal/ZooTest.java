package interfaces.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;
    List<Animal> animals;

    @BeforeEach
    void setUp() {
        animals = new ArrayList<>(Arrays.asList(new Duck(), new Lion(), new Worm()));
        zoo = new Zoo(animals);
    }

    @Test
    void getAnimalsTest() {
        assertEquals(animals, zoo.getAnimals());
    }

    @Test
    void getNumberOfAnimalsTest() {
        assertEquals(3, zoo.getNumberOfAnimals());
    }

    @Test
    void getNumberOfAllLegsTest() {
        assertEquals(6, zoo.getNumberOfAllLegs());
    }
}