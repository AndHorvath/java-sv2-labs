package inheritancemethods.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John Doe", "123 Central Rd. Mainville 10101");
    }

    @Test
    void getNameTest() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    void getAddressTest() {
        assertEquals("123 Central Rd. Mainville 10101", person.getAddress());
    }

    @Test
    void migrateTest() {
        person.migrate("111 New St. Mainville 21212");
        assertEquals("111 New St. Mainville 21212", person.getAddress());
    }
}