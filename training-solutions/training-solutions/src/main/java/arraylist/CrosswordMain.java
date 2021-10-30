package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrosswordMain {

    public static void main(String[] args) {
        String[] wordsArray = {
                "KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ",
                "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA" };
        int specifiedWordLength = 6;

        ArrayListHandler arrayListHandler = new ArrayListHandler();
        List<String> words = new ArrayList<>();
        List<String> sixLetterWords;
        Crossword crossword;

        arrayListHandler.fillDynamicListFromStringArray(words, wordsArray);
        crossword = new Crossword(words);
        sixLetterWords = crossword.getWordsOfGivenLength(specifiedWordLength);

        System.out.println(sixLetterWords.toString());
    }
}
