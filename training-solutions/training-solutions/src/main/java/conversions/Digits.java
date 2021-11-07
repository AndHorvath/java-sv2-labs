package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    // --- attributes ---------------------------------------------------------

    private List<Integer> integerList;

    // --- constructors -------------------------------------------------------

    public Digits() {
        integerList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Integer> getIntegerList() { return integerList; }

    // --- public methods -----------------------------------------------------

    public void addDigitsToList(String text) {
        for (Character character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                integerList.add(Integer.parseInt(character.toString()));
            }
        }
    }
}