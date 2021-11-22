package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] userInputArray;

        System.out.println("Please, enter a positive number!");
        userInputArray = scanner.nextLine().toCharArray();

        for (char character : userInputArray) {
            if (!Character.isDigit(character)) {
                throw new IllegalArgumentException("Not a positive number.");
            }
        }
    }
}