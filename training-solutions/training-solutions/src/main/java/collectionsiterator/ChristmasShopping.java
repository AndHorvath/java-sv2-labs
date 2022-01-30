package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    // --- attributes ---------------------------------------------------------

    private List<ChristmasPresent> presents;

    // --- constructors -------------------------------------------------------

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    // --- getters and setters ------------------------------------------------

    public List<ChristmasPresent> getPresents() { return presents; }

    // --- public methods -----------------------------------------------------

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresents(int maxPrice) {
        Iterator<ChristmasPresent> iterator = presents.iterator();
        while (iterator.hasNext()) {
            updatePresentList(iterator, maxPrice);
        }
    }

    // --- private methods ----------------------------------------------------

    private void updatePresentList(Iterator<ChristmasPresent> iterator, int maxPrice) {
        ChristmasPresent present = iterator.next();
        if (present.getPrice() > maxPrice) {
            iterator.remove();
        }
    }
}