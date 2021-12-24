package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {

    // --- attributes ---------------------------------------------------------

    private final int extraCharge = 20_000;

    // --- constructors -------------------------------------------------------

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    // --- getters and setters ------------------------------------------------

    public int getExtraCharge() { return extraCharge; }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + extraCharge;
    }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return getName() + " " + getPercent() + "% " + extraCharge + " " + getPriceOfPlaneTicket();
    }
}