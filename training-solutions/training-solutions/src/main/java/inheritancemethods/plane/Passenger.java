package inheritancemethods.plane;

public class Passenger {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int priceOfPlaneTicket;

    // --- constructors -------------------------------------------------------

    public Passenger(String name, int priceOfPlaneTicket) {
        this.name = name;
        this.priceOfPlaneTicket = priceOfPlaneTicket;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getPriceOfPlaneTicket() { return priceOfPlaneTicket; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return name + " " + priceOfPlaneTicket;
    }
}