package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String emailAddress;

        System.out.println("Please, enter your name!");
        name = scanner.nextLine();

        System.out.println("Enter your email address!");
        emailAddress = scanner.nextLine();

        System.out.println("You have successfully registered.");
        System.out.println("Your name: " + name);
        System.out.println("Your email address: " + emailAddress);
    }
}
