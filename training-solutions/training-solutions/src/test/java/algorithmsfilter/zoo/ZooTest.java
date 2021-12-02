package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void setUp() {
        zoo = new Zoo(new ArrayList<>(Arrays.asList(
                new Animal("camel", 4),
                new Animal("eagle", 2)
        )));
    }

    @Test
    void getAnimalsTest() {
        assertEquals(2, zoo.getAnimals().size());

        assertEquals("camel", zoo.getAnimals().get(0).getName());
        assertEquals("eagle", zoo.getAnimals().get(1).getName());

        assertEquals(4, zoo.getAnimals().get(0).getNumberOfLegs());
        assertEquals(2, zoo.getAnimals().get(1).getNumberOfLegs());
    }

    @Test
    void addAnimalTest() {
        zoo.addAnimal(new Animal("horse", 4));

        assertEquals(3, zoo.getAnimals().size());
        assertEquals("horse", zoo.getAnimals().get(2).getName());
        assertEquals(4, zoo.getAnimals().get(2).getNumberOfLegs());
    }

    @Test
    void getAnimalsWithNumberOfLegsGivenTest() {
        zoo.addAnimal(new Animal("horse", 4));
        List<Animal> expectedResult = Arrays.asList(
                zoo.getAnimals().get(0), zoo.getAnimals().get(2)
        );
        assertEquals(expectedResult, zoo.getAnimalsWithNumberOfLegsGiven(4));
    }
}