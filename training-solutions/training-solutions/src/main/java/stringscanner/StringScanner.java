package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scannerForConsoleInput = new Scanner(System.in);
        Scanner scannerForReadingWords;
        Scanner scannerForReadingSubordinateClauses;
        String sentence;

        System.out.println("Please, enter a sentence!");
        sentence = scannerForConsoleInput.nextLine();
        scannerForReadingWords = new Scanner(sentence);
        while (scannerForReadingWords.hasNext()) {
            System.out.println(scannerForReadingWords.next());
        }

        System.out.println("Now, enter another sentence!");
        sentence = scannerForConsoleInput.nextLine();
        scannerForReadingSubordinateClauses = new Scanner(sentence).useDelimiter(", ");
        while (scannerForReadingSubordinateClauses.hasNext()) {
            System.out.println(scannerForReadingSubordinateClauses.next());
        }
    }
}