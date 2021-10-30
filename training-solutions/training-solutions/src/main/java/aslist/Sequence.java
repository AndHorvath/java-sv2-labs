package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    // --- attributes ---------------------------------------------------------

    private final List<Integer> elements;

    // --- constructors -------------------------------------------------------

    public Sequence(int firstElement, int secondElement) {
        elements = new ArrayList(Arrays.asList(firstElement, secondElement));
    }

    // --- getters and setters ------------------------------------------------

    public List<Integer> getElements() { return elements; }

    // --- public methods -----------------------------------------------------

    public void addProductOfTwoLast(int numberOfIterations) {
        int lastElement;
        int lastButOneElement;

        for (int i = 0; i < numberOfIterations; i++) {
            lastElement = elements.get(elements.size() - 1);
            lastButOneElement = elements.get(elements.size() - 2);

            elements.add(lastElement * lastButOneElement);
        }
    }

    public void printElements() {
        String elementsResult = "";

        for (int i = 0; i < elements.size(); i++) {
            elementsResult += elements.get(i) + (i != elements.size() - 1 ? ", "  : "");
        }
        System.out.println("The numbers in the sequence are: " + elementsResult);
    }
}
