package inheritancemethods.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("John Doe", "123 Central Rd. Mainville 10101", 2000d);
    }

    @Test
    void getSalaryTest() {
        assertEquals(2000d, employee.getSalary());
    }

    @Test
    void raiseSalaryTest() {
        employee.raiseSalary(10);
        assertEquals(2200d, employee.getSalary());
    }
}