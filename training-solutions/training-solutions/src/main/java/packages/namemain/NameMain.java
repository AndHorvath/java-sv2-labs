package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;
import java.util.Scanner;

public class NameMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LastName lastName;
        FirstName firstName;
        Prefix prefix;
        String userLastName;
        String userFirstName;
        String userPrefix;
        String wS = " "; // stands for word space

        System.out.println("Please, enter the person's last name!");
        userLastName = scanner.nextLine();

        System.out.println("Now, enter the first name!");
        userFirstName = scanner.nextLine();

        System.out.println("Enter a title!");
        userPrefix = scanner.nextLine();

        lastName = new LastName(userLastName);
        firstName = new FirstName(userFirstName);
        prefix = new Prefix(userPrefix);

        System.out.println(
                "The given name is: " +
                        prefix.getPre() + wS + firstName.getFirst() + wS + lastName.getLast() );
    }
}