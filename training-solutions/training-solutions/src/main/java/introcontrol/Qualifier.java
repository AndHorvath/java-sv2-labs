package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        System.out.println("Please, specify a number!");
        number = scanner.nextDouble();

        if (number > 100.0) {
            System.out.println("Greater than 100.");
        } else {
            System.out.println("Less than or equal to 100.");
        }
    }
}
