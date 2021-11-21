package introexceptionmoreexceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("James Doe", 20);
    }

    @Test
    void getNameTest() {
        assertEquals("James Doe", person.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(20 ,person.getAge());
    }

    @Test
    void testToStringTest() {
        String expected = "James Doe 20 years";
        assertEquals(expected, person.toString());
    }
}