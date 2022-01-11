package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {

    // --- attributes ---------------------------------------------------------

    private final CanCarryGoods canCarryGoods;
    private final CanCarryPassengers canCarryPassengers;

    // --- constructors -------------------------------------------------------

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    // --- getters and setters ------------------------------------------------

    public CanCarryGoods getCanCarryGoods() { return canCarryGoods; }
    public CanCarryPassengers getCanCarryPassengers() { return canCarryPassengers; }

    // --- public methods -----------------------------------------------------

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}