package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> firstTwoLetters = new ArrayList<>();
        for (String word : words) {
            if (word != null && word.length() > 1) {
                firstTwoLetters.add(word.substring(0, 2));
            } else {
                throw new IllegalArgumentException("Invalid word entry.");
            }
        }
        return firstTwoLetters;
    }
}