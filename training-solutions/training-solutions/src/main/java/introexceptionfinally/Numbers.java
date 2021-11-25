package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers numbers = new Numbers();
        String input;

        do {
            System.out.println("Please, enter a whole number!");
            input = scanner.nextLine();
        } while (numbers.getNumber(input) % 2 != 0);
    }

    private int getNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Not a number.", exception);
        } finally {
            System.out.println("End of round.");
        }
    }
}