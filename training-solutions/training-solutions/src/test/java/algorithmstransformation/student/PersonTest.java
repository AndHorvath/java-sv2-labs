package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Jack Doe", "11 Main Str. 10000 Middletown", 30);
    }

    @Test
    void getNameTest() {
        String expectedName = "Jack Doe";
        assertEquals(expectedName, person.getName());
    }

    @Test
    void getAddressTest() {
        String expectedAddress = "11 Main Str. 10000 Middletown";
        assertEquals(expectedAddress, person.getAddress());
    }

    @Test
    void getAgeTest() {
        int expectedAge = 30;
        assertEquals(expectedAge, person.getAge());
    }
}