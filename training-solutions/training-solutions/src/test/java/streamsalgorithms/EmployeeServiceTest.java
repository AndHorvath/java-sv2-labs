package streamsalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    EmployeeService employeeService;
    EmployeeService.EmployeeComparatorByBirthYear comparatorByBirthYear;
    Employee employeeA;
    Employee employeeB;
    Employee employeeC;
    Employee employeeD;
    Employee employeeE;

    @BeforeEach
    void setUp() {
        employeeA = new Employee("Employee A", 1960);
        employeeB = new Employee("Employee B", 1970);
        employeeC = new Employee("Employee C", 1980);
        employeeD = new Employee("Employee D", 1990);
        employeeE = new Employee("Employee E", 2000);

        employeeService = new EmployeeService(
            new ArrayList<>(List.of(employeeA, employeeB, employeeC, employeeD, employeeE))
        );
        comparatorByBirthYear = new EmployeeService.EmployeeComparatorByBirthYear();
    }

    @Test
    void compareTest() {
        assertTrue(comparatorByBirthYear.compare(employeeA, employeeB) < 0);
        assertTrue(comparatorByBirthYear.compare(employeeC, employeeB) > 0);
    }

    @Test
    void getEmployeesTest() {
        assertEquals(
            new ArrayList<>(List.of(employeeA, employeeB, employeeC, employeeD, employeeE)),
            employeeService.getEmployees()
        );
    }

    @Test
    void addUpEmployeesBirthYearsTest() {
        assertEquals(9900, employeeService.addUpEmployeesBirthYears());
    }

    @Test
    void addUpEmployeesAgesTest() {
        assertEquals(210, employeeService.addUpEmployeesAges());
    }

    @Test
    void getNumberOfEmployeesTest() {
        assertEquals(5, employeeService.getNumberOfEmployees());
    }

    @Test
    void getNumberOfEmployeesWithBirthYearBefore1990Test() {
        assertEquals(3, employeeService.getNumberOfEmployeesWithBirthYearBefore1990());
    }

    @Test
    void getBirthYearOfOldestEmployeeTest() {
        assertEquals(1960, employeeService.getBirthYearOfOldestEmployee());
    }

    @Test
    void getNameOfOldestEmployeeTest() {
        assertEquals("Employee A", employeeService.getNameOfOldestEmployee());
    }

    @Test
    void doAllEmployeesHaveBirthYearsBefore1980Test() {
        assertFalse(employeeService.doAllEmployeesHaveBirthYearsBefore1980());
    }

    @Test
    void getEmployeesWithBirthYearBefore1990Test() {
        assertEquals(
            new ArrayList<>(List.of(employeeA, employeeB, employeeC)),
            employeeService.getEmployeesWithBirthYearBefore1990()
        );
    }

    @Test
    void getNamesOfEmployeesTest() {
        assertEquals(
            new ArrayList<>(List.of("Employee A", "Employee B", "Employee C", "Employee D", "Employee E")),
            employeeService.getNamesOfEmployees()
        );
    }

    @Test
    void getNamesOfEmployeesWithBirthYearsBefore1990Test() {
        assertEquals(
            new ArrayList<>(List.of("Employee A", "Employee B", "Employee C")),
            employeeService.getNamesOfEmployeesWithBirthYearsBefore1990()
        );
    }
}