package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    // --- attributes ---------------------------------------------------------

    private int cargoWeight;
    private final int maxCargoWeight;

    // --- constructors -------------------------------------------------------

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public int getCargoWeight() { return cargoWeight; }
    public int getMaxCargoWeight() { return maxCargoWeight; }

    // --- public methods -----------------------------------------------------

    @Override
    public int loadCargo(int cargoWeight) {
        this.cargoWeight = Math.min(cargoWeight, maxCargoWeight);
        return cargoWeight - this.cargoWeight;
    }
}