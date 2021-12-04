package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;
    List<Person> personList;
    Person newPerson;

    @BeforeEach
    void setUp() {
        personList = new ArrayList<>(Arrays.asList(
                new Person("Joan Doe", "11 Main Str. 10000 Middletown", 7),
                new Person("Jeff Doe", "22 Main Ave. 20000 Middletown", 8),
                new Person("Jane Doe", "11 Main Str. 10000 Middletown", 30),
                new Person("Jack Doe", "11 Main Str. 10000 Middletown", 30)
        ));
        newPerson =
                new Person("Judd Doe", "22 Main Ave. 20000 Middletown", 50);
        primarySchool = new PrimarySchool(personList);
    }

    @Test
    void getPersonListTest() {
        List<Person> expectedPersonList = personList;
        assertEquals(expectedPersonList, primarySchool.getPersonList());
    }

    @Test
    void addPersonTest() {
        personList.add(newPerson);
        List<Person> expectedResult = personList;
        assertEquals(expectedResult, primarySchool.getPersonList());
    }

    @Test
    void getStudentsTest() {
        assertEquals(2, primarySchool.getStudents().size());
        assertEquals("Joan Doe", primarySchool.getStudents().get(0).getName());
        assertEquals("22 Main Ave. 20000 Middletown", primarySchool.getStudents().get(1).getAddress());
    }
}