package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        String name;
        int year;
        int month;
        int day;

        System.out.println("Please, enter the employee's data!\r\nThe name:");
        name = scanner.nextLine();
        System.out.println("Year of birth:");
        year = scanner.nextInt();
        System.out.println("Month of birth:");
        month = scanner.nextInt();
        System.out.println("Day of birth:");
        day = scanner.nextInt();

        employee = new Employee(name, year, month, day);

        System.out.println("The employee's data." +
                "\nName: " + employee.getName() +
                "\nDate of birth: " + employee.getDateOfBirth() +
                "\nBegin of employment: " + employee.getBeginEmployment());
    }
}