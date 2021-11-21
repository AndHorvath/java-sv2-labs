package introexceptiontrycatch;

import java.util.List;

public class FirstLetter {

    // --- attributes ---------------------------------------------------------

    private List<String> words;

    // --- constructors -------------------------------------------------------

    public FirstLetter(List<String> words) {
        this.words = words;
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getWords() { return words; }

    // --- public methods -----------------------------------------------------

    public String[] getFirstLetterArray() {
        String[] firstLetterArray = new String[words.size()];

        for (int i = 0; i < words.size(); i++) {
            try {
                try {
                    firstLetterArray[i] = Character.toString(words.get(i).charAt(0));
                } catch (NullPointerException exception) {
                    reportExceptionalBehaviour(firstLetterArray, i);
                    System.out.println(exception.getMessage() + "\n");
                }
            } catch (StringIndexOutOfBoundsException exception) {
                reportExceptionalBehaviour(firstLetterArray, i);
                System.out.println(exception.getMessage() + "\n");
            }
        }
        return firstLetterArray;
    }

    // --- private methods ----------------------------------------------------

    private void reportExceptionalBehaviour(String[] firstLetterArray, int index) {
        firstLetterArray[index] = "-";
        System.out.println("There is no word in the " + (index + 1) + ". position.");
    }
}