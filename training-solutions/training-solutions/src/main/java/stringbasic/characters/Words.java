package stringbasic.characters;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToSpell;
        String actualStep = "";

        System.out.println("Please, enter the word to spell!");
        wordToSpell = scanner.nextLine();

        System.out.println("The word to spell is: " + wordToSpell);

        for (int i = 0; i < wordToSpell.length(); i++) {
            System.out.println("Please, enters the " + (i + 1) + "." + " letter!");
            actualStep = actualStep.concat(scanner.nextLine());
        }
        System.out.println(wordToSpell.equals(actualStep) ? "Successfully spelt!" : "You have made a mistake.");
    }
}