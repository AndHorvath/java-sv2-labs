package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        String name;
        String ageString;
        String isSuccessfulString = "";
        boolean isSuccessful = true;

        System.out.println("Hello!");

        System.out.println("Please, enter your name!");
        name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            isSuccessful = false;
        }

        System.out.println("Enter your age!");
        ageString = scanner.nextLine();
        try {
            try {
                try {
                    validation.validateAge(ageString);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                    isSuccessful = false;
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                isSuccessful = false;
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            isSuccessful = false;
        }

        System.out.println("Your registration data:");
        System.out.println(name);
        System.out.println(ageString);
        if (!isSuccessful) {
            isSuccessfulString = " not";
        }
        System.out.println("Registration is" + isSuccessfulString + " successful.");
    }
}