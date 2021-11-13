package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    // --- attributes ---------------------------------------------------------

    private List<String> words;

    // --- constructors -------------------------------------------------------

    public Words() {
        words = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getWords() { return words; }

    // --- public methods -----------------------------------------------------

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> wordsToRemove = new ArrayList<>();

        for (String word : words) {
            if (!word.startsWith(prefix)) {
                wordsToRemove.add(word);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public void getWordsWithLength(int length) {
        List<String> wordsToRemove = new ArrayList<>();

        for (String word : words) {
            if (word.length() != length) {
                wordsToRemove.add(word);
            }
        }
        words.removeAll(wordsToRemove);
    }
}