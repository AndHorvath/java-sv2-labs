package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;

        System.out.println("Page menu\nPlease, select an item:");
        System.out.println("1. Listing of users");
        System.out.println("2. Recording of a user");
        System.out.println("Other: Exit");

        number = scanner.nextLine();

        if (number.equals("1")) {
            System.out.println("Listing of users");
        }
        if (number.equals("2")) {
            System.out.println("Recording of the user");
        }
    }
}
