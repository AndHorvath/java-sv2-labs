package inheritancemethods.plane;

public class PriorityPassenger extends Passenger {

    // --- attributes ---------------------------------------------------------

    private final int percent;

    // --- constructors -------------------------------------------------------

    public PriorityPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket);
        this.percent = percent;
    }

    // --- getters and setters ------------------------------------------------

    public int getPercent() { return percent; }

    @Override
    public int getPriceOfPlaneTicket() {
        return (int) Math.round(super.getPriceOfPlaneTicket() * (1d + percent / 100d));
    }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return getName() + " " + percent + "% " + getPriceOfPlaneTicket();
    }
}