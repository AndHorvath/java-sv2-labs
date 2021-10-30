package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {

    // --- attributes ---------------------------------------------------------

    private final List<Integer> numbers;
    private final int frequency;

    // --- constructors -------------------------------------------------------

    public Second(List<Integer> numbers) { this.numbers = numbers; frequency = 2; }

    // --- getters and setters ------------------------------------------------

    public List<Integer> getNumbers() { return numbers; }

    // --- public methods -----------------------------------------------------

    public List<Integer> getNumbersAccordingToFrequency() {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if ((i + 1) % frequency == 0) {
                resultList.add(numbers.get(i));
            }
        }
        return resultList;
    }
}
