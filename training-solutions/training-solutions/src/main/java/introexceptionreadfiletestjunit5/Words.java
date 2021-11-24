package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
        List<String> words = readWords(path);
        for (String word : words) {
            if (isWordValid(word) && word.charAt(0) == 'A') {
                return word;
            }
        }
        return "A";
    }

    private List<String> readWords(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.");
        }
    }

    private boolean isWordValid(String word) {
        if (word == null || word.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid word entry.");
        }
        return true;
    }
}