package isahasa.inhabitant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John Doe");
    }

    @Test
    void getNameTest() {
        assertEquals("John Doe", person.getName());
    }
}