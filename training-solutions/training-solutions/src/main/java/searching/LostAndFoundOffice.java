package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    // --- attributes ---------------------------------------------------------

    private List<LostProperty> lostProperties;

    // --- constructors -------------------------------------------------------

    public LostAndFoundOffice() {
        lostProperties = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<LostProperty> getLostProperties() { return lostProperties; }

    // --- public methods -----------------------------------------------------

    public void addLostProperty(LostProperty lostProperty) {
        lostProperties.add(lostProperty);
    }

    public LostProperty findLostProperty(LostProperty searched) {
        int specifiedIndex = Collections.binarySearch(lostProperties, searched);
        if (specifiedIndex < 0) {
            throw new IllegalStateException("Specified property is not in the collection.");
        }
        return lostProperties.get(specifiedIndex);
    }
}