package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 2020, 300_000);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());

        employee.raiseSalary(100_000);
        System.out.println(employee.getSalary());

        System.out.println(employee);
    }
}