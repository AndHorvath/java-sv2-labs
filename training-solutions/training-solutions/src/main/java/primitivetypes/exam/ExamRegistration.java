package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();
        Person person;
        String name;
        int yearOfBirth;
        int monthOfBirth;
        int dayOfBirth;
        LocalDate dateOfBirth;
        int zipCode;
        double gradeAverage;

        System.out.println("Please, enter the name!");
        name = scanner.nextLine();
        System.out.println("Enter year of birth!");
        yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month of birth!");
        monthOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter day of birth!");
        dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter zip code!");
        zipCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the grade point average!");
        gradeAverage = Double.parseDouble(scanner.nextLine());

        dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        person = new Person(name, dateOfBirth, zipCode, gradeAverage);
        exam.addPerson(person);
        System.out.println(exam.getPersonList());
    }
}