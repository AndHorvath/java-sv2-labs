package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    // --- attributes ---------------------------------------------------------

    private List<Object> items;
    private int cursor;

    // --- constructors -------------------------------------------------------

    public SimpleBag() {
        items = new ArrayList<>();
        cursor = -1;
    }

    // --- getters and setters ------------------------------------------------

    public List<Object> getItems() { return items; }
    public int getCursor() { return cursor; }

    // --- public methods -----------------------------------------------------

    public void putItem(Object item) {
        items.add(item);
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public boolean hasNext() {
        return size() > cursor + 1;
    }

    public int size() {
        return items.size();
    }

    public Object next() {
        if (hasNext()) {
            cursor++;
            return items.get(cursor);
        }
        throw new IllegalStateException("No more items in the bag.");
    }
}