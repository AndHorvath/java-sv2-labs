package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    // --- attributes ---------------------------------------------------------

    private int passengers;
    private final int maxPassengers;

    // --- constructors -------------------------------------------------------

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public int getPassengers() { return passengers; }
    public int getMaxPassengers() { return maxPassengers; }

    // --- public methods -----------------------------------------------------

    @Override
    public int loadPassenger(int passengers) {
        this.passengers = Math.min(passengers, maxPassengers);
        return passengers - this.passengers;
    }
}