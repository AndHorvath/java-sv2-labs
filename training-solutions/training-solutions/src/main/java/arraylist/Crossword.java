package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {

    // --- attributes ---------------------------------------------------------

    private List<String> words;

    // --- constructors -------------------------------------------------------

    public Crossword(List<String> words) { this.words = words; }

    // --- getters and setters ------------------------------------------------

    public List<String> getWords() { return words; }

    // --- public methods -----------------------------------------------------

    public List<String> getWordsOfGivenLength(int length) {
        List<String> resultList = new ArrayList<>();

        for (String word : words) {
            if (word.length() == 6) {
                resultList.add(word);
            }
        }
        return resultList;
    }
}