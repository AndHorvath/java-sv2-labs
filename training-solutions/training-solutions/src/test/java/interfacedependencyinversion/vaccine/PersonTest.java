package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Jane Doe", 30, ChronicDisease.NO, Pregnancy.YES);
    }

    @Test
    void getNameTest() {
        assertEquals("Jane Doe", person.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(30, person.getAge());
    }

    @Test
    void getChronicTest() {
        assertEquals(ChronicDisease.NO, person.getChronic());
    }

    @Test
    void getPregnancyTest() {
        assertEquals(Pregnancy.YES, person.getPregnancy());
    }
}