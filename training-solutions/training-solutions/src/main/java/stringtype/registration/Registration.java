package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        String userName;
        String password1;
        String password2;
        String email;

        System.out.println("Please, enter the user name!");
        userName = scanner.nextLine();
        System.out.println(
                "This user name is " + (userValidator.isValidUserName(userName) ? "valid." : "not valid."));

        System.out.println("Please, enter the password!");
        password1 = scanner.nextLine();
        System.out.println("Now, enter it again!");
        password2 = scanner.nextLine();
        System.out.println(
                "The password is " + (userValidator.isValidPassword(password1, password2) ?
                "valid." : "not valid or you have entered two different ones."));

        System.out.println("Enter the email address!");
        email = scanner.nextLine();
        System.out.println(
                "This email address is " + (userValidator.isValidEmail(email) ? "valid." : "not valid."));
    }
}