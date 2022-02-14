package streamsalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Employee", 2000);
    }

    @Test
    void getNameTest() {
        assertEquals("Employee", employee.getName());
    }

    @Test
    void getYearOfBirthTest() {
        assertEquals(2000, employee.getYearOfBirth());
    }
}