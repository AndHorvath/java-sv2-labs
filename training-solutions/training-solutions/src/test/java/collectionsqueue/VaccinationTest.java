package collectionsqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class VaccinationTest {

    Vaccination vaccination;
    List<Person> people;

    @BeforeEach
    void setUp() {
        vaccination = new Vaccination();
    }

    @Test
    void getVaccinationOrderTest() {
        people = new ArrayList<>(List.of(
            new Person("Person A", 50), new Person("Person B", 40), new Person("Person C", 10),
            new Person("Person D", 20), new Person("Person E", 30), new Person("Person F", 70),
            new Person("Person G", 60)
        ));
        assertEquals("[20, 30, 40, 50, 60]", vaccination.getVaccinationOrder(people).toString());
        assertEquals(20, vaccination.getVaccinationOrder(people).poll());
    }
}