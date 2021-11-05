package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    // --- attributes ---------------------------------------------------------

    private List<String> colours;

    // --- constructors -------------------------------------------------------

    public Capsules() { colours = new ArrayList<>(); }

    // --- getters and setters ------------------------------------------------

    public List<String> getColours() { return colours; }

    // --- public methods -----------------------------------------------------

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void removeLast() {
        if (colours.size() > 0) {
            colours.remove(colours.size() - 1);
        }
    }

    public void removeFirst() {
        if (colours.size() > 0) {
            colours.remove(0);
        }
    }
}