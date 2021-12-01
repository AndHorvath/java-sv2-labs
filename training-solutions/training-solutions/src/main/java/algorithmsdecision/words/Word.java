package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String lowerBoundWord) {
        for (String word : words) {
            if (word.length() > lowerBoundWord.length()) {
                return true;
            }
        }
        return false;
    }
}