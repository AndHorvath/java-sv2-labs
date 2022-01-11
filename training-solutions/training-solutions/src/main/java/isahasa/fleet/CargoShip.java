package isahasa.fleet;

public class CargoShip implements Ship, CanCarryGoods {

    // --- attributes ---------------------------------------------------------

    private final CanCarryGoods canCarryGoods;

    // --- constructors -------------------------------------------------------

    public CargoShip(int maxCargoWeight) {
        canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    // --- getters and setters ------------------------------------------------

    public CanCarryGoods getCanCarryGoods() { return canCarryGoods; }

    // --- public methods -----------------------------------------------------

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }
}