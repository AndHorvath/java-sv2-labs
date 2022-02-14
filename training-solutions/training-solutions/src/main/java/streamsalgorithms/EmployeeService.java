package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeService {

    // --- inner classes ------------------------------------------------------

    public static class EmployeeComparatorByBirthYear implements Comparator<Employee> {

        @Override
        public int compare(Employee employee, Employee other) {
            return Integer.compare(employee.getYearOfBirth(), other.getYearOfBirth());
        }
    }

    // --- attributes ---------------------------------------------------------

    private List<Employee> employees;

    // --- constructors -------------------------------------------------------

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    // --- getters and setters ------------------------------------------------

    public List<Employee> getEmployees() { return employees; }

    // --- public methods -----------------------------------------------------

    public int addUpEmployeesBirthYears() {
        return employees.stream()
            .mapToInt(Employee::getYearOfBirth)
            .sum();
    }

    public int addUpEmployeesAges() {
        return employees.stream()
            .mapToInt(employee -> LocalDate.now().getYear() - employee.getYearOfBirth())
            .sum();
    }

    public long getNumberOfEmployees() {
        return employees.stream()
            .count();
    }

    public long getNumberOfEmployeesWithBirthYearBefore1990() {
        return employees.stream()
            .filter(employee -> employee.getYearOfBirth() < 1990)
            .count();
    }

    public int getBirthYearOfOldestEmployee() {
        return employees.stream()
            .mapToInt(Employee::getYearOfBirth)
            .min().orElseThrow(exceptionSupplier());
    }

    public String getNameOfOldestEmployee() {
        return employees.stream()
            .sorted(new EmployeeComparatorByBirthYear())
            .map(Employee::getName)
            .findFirst().orElseThrow(exceptionSupplier());
    }

    public boolean doAllEmployeesHaveBirthYearsBefore1980() {
        return employees.stream()
            .allMatch(employee -> employee.getYearOfBirth() < 1980);
    }

    public List<Employee> getEmployeesWithBirthYearBefore1990() {
        return employees.stream()
            .filter(employee -> employee.getYearOfBirth() < 1990)
            .toList();
    }

    public List<String> getNamesOfEmployees() {
        return employees.stream()
            .map(Employee::getName)
            .toList();
    }

    public List<String> getNamesOfEmployeesWithBirthYearsBefore1990() {
        return employees.stream()
            .filter(employee -> employee.getYearOfBirth() < 1990)
            .map(Employee::getName)
            .toList();
    }

    // --- main method --------------------------------------------------------

    public static void main(String[] args) {
        Employee employeeA = new Employee("Employee A", 1960);
        Employee employeeB = new Employee("Employee B", 1970);
        Employee employeeC = new Employee("Employee C", 1980);
        Employee employeeD = new Employee("Employee D", 1990);
        Employee employeeE = new Employee("Employee E", 2000);

        EmployeeService employeeService = new EmployeeService(
            new ArrayList<>(List.of(employeeA, employeeB, employeeC, employeeD, employeeE))
        );

        System.out.println(employeeService.addUpEmployeesBirthYears());
        System.out.println(employeeService.addUpEmployeesAges());
        System.out.println(employeeService.getNumberOfEmployees());
        System.out.println(employeeService.getNumberOfEmployeesWithBirthYearBefore1990());
        System.out.println(employeeService.getBirthYearOfOldestEmployee());
        System.out.println(employeeService.getNameOfOldestEmployee());
        System.out.println(employeeService.doAllEmployeesHaveBirthYearsBefore1980());
        System.out.println(employeeService.getEmployeesWithBirthYearBefore1990());
        System.out.println(employeeService.getNamesOfEmployees());
        System.out.println(employeeService.getNamesOfEmployeesWithBirthYearsBefore1990());
    }

    // --- private methods ----------------------------------------------------

    private Supplier<IllegalArgumentException> exceptionSupplier() {
        return () -> new IllegalArgumentException("Empty list.");
    }
}