package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean isAWord = true;

        System.out.println("Enter a word of a maximum length of 5 characters!");
        userInput = scanner.nextLine();

        if (userInput.length() > 5) {
            throw new IllegalArgumentException("Entry longer than 5 characters.");
        } else {
            for (char character : userInput.toCharArray()) {
                if (!Character.isAlphabetic(character)) {
                    throw new IllegalArgumentException("Entry not a word.");
                }
            }
        }
        System.out.println("Your entry: " + userInput);
    }
}