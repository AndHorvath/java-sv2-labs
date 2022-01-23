package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class Postman {

    // --- attributes ---------------------------------------------------------

    private List<String> addresses;

    // --- constructors -------------------------------------------------------

    public Postman() {
        this.addresses = new LinkedList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getAddresses() { return addresses; }

    // --- public methods -----------------------------------------------------

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        addresses.remove(address);
    }
}