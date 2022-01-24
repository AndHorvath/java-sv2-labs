package collectionsqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Person", 50);
    }

    @Test
    void getNameTest() {
        assertEquals("Person", person.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(50, person.getAge());
    }
}