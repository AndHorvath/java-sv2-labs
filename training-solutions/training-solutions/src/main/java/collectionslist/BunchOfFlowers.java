package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    // --- attributes ---------------------------------------------------------

    private List<String> flowers;

    // --- constructors -------------------------------------------------------

    public BunchOfFlowers() {
        flowers = new LinkedList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getFlowers() { return flowers; }

    // --- public methods -----------------------------------------------------

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int middle = getMiddle();
        flowers.add(middle + 1, flower);
        if (isOdd(flowers.size() - 1)) {
            flowers.add(middle, flower);
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private int getMiddle() {
        return isOdd(flowers.size()) ? (flowers.size() + 1) / 2 - 1 : flowers.size() / 2 - 1;
    }
}