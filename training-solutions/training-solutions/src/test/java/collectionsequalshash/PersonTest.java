package collectionsequalshash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    Person other;

    @BeforeEach
    void setUp() {
        person = new Person("John Doe", 40, "ABC-123");
    }

    @Test
    void getNameTest() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(40, person.getAge());
    }

    @Test
    void getSocialSecurityNumberTest() {
        assertEquals("ABC-123", person.getSocialSecurityNumber());
    }

    @Test
    void testEqualsTest() {
        other = new Person("Jack Doe", 50, "ABC-123");
        assertEquals(person, other);

        other = new Person("John Doe", 40, "XYW-789");
        assertNotEquals(person, other);
    }

    @Test
    void testHashCodeTest() {
        other = new Person("Jack Doe", 50, "ABC-123");
        assertEquals(person.hashCode(), other.hashCode());
    }
}