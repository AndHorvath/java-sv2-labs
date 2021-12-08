package staticattrmeth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog("William", Species.MIXTURE, 2);
        dog.setCode(1);
    }

    @Test
    void getNameTest() {
        assertEquals("William", dog.getName());
    }

    @Test
    void getSpeciesTest() {
        assertEquals(Species.MIXTURE, dog.getSpecies());
    }

    @Test
    void getAgeTest() {
        assertEquals(2, dog.getAge());
    }

    @Test
    void getCodeTest() {
        assertEquals(1L, dog.getCode());
    }

    @Test
    void setCodeTest() {
        dog.setCode(11L);
        assertEquals(11L, dog.getCode());
    }
}