package introexceptionwritefile;

import java.util.Scanner;

public class BirthdayMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Birthday birthday = new Birthday();
        int numberOfEntries = 0;
        String name;
        String dateOfBirth;

        System.out.println("Please, indicate how many people you would like to record.");
        try {
            numberOfEntries = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Enter the " + (i + 1) + ". name!");
            name = scanner.nextLine();
            System.out.println("Enter date of birth!");
            dateOfBirth = scanner.nextLine();

            birthday.addEntry(name, dateOfBirth);
        }
        birthday.writeBirthdaysToFile();
    }
}