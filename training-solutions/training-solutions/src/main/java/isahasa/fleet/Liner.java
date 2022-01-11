package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    // --- attributes ---------------------------------------------------------

    private final CanCarryPassengers canCarryPassengers;

    // --- constructors -------------------------------------------------------

    public Liner(int maxPassengers) {
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    // --- getters and setters ------------------------------------------------

    public CanCarryPassengers getCanCarryPassengers() { return canCarryPassengers; }

    // --- public methods -----------------------------------------------------

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}