package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();
        Person person;

        System.out.println("Please, enter the first name!");
        String firstName = scanner.nextLine();
        System.out.println("Enter the surname!");
        String lastName = scanner.nextLine();
        String name = registration.createName(firstName, lastName);

        System.out.println("Enter the year of birth!");
        int year = scanner.nextInt();
        System.out.println("Enter the month of birth!");
        int month = scanner.nextInt();
        System.out.println("Enter the day of birth!");
        int day = scanner.nextInt();
        scanner.nextLine();
        LocalDate dateOfBirth = registration.createDateOfBirth(year, month, day);

        System.out.println("Enter the email address!");
        String email = scanner.nextLine();

        person = new Person(name, email, dateOfBirth);
        System.out.println(person);
    }
}