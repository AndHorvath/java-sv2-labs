package arraylist;

import java.util.List;

public class Freezer {

    // --- attributes ---------------------------------------------------------

    private List<String> thingsInFridge;

    // --- constructors -------------------------------------------------------

    public Freezer(List<String> thingsInFridge) { this.thingsInFridge = thingsInFridge; }

    // --- getters and setters ------------------------------------------------

    public List<String> getThingsInFridge() { return this.thingsInFridge; }

    // --- public methods -----------------------------------------------------

    public void printFridgeContentsAndSize() {
        System.out.println(getThingsInFridge().toString() + ", " + getThingsInFridge().size());
    }
}