package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog();

        dog.setName("Williams");
        dog.setAge(1);
        dog.setPedigree(false);
        dog.setWeight(10d);
    }

    @Test
    void getNameTest() {
        assertEquals("Williams", dog.getName());
    }

    @Test
    void setNameTest() {
        dog.setName("Edward");
        assertEquals("Edward", dog.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(1, dog.getAge());
    }

    @Test
    void setAgeTest() {
        dog.setAge(2);
        assertEquals(2, dog.getAge());
    }

    @Test
    void isPedigreeTest() {
        assertFalse(dog.isPedigree());
    }

    @Test
    void setPedigreeTest() {
        dog.setPedigree(true);
        assertTrue(dog.isPedigree());
    }

    @Test
    void getWeightTest() {
        assertEquals(10d, dog.getWeight());
    }

    @Test
    void setWeightTest() {
        dog.setWeight(11d);
        assertEquals(11d, dog.getWeight());
    }
}