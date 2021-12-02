package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (prefix.equals(word.substring(0, prefix.length()))) {
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }
}