package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    // --- public methods -----------------------------------------------------

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return buildHiddenWord(scanner);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private String buildHiddenWord(Scanner scanner) {
        StringBuilder hiddenWord = new StringBuilder();
        while (scanner.hasNextLine()) {
            appendFoundLetter(hiddenWord, scanner.nextLine());
        }
        return hiddenWord.toString();
    }

    private void appendFoundLetter(StringBuilder word, String line) {
        boolean isLetterFound = false;
        for (char character : line.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                word.append(character);
                isLetterFound = true;
            }
        }
        appendWhitespace(word, isLetterFound);
    }

    private void appendWhitespace(StringBuilder word, boolean isLetterFound) {
        if (!isLetterFound) {
            word.append(' ');
        }
    }
}