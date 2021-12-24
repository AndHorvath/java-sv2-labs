package inheritancemethods.car;

public class Jeep extends Car {

    // --- attributes ---------------------------------------------------------

    private double extraCapacity;
    private double extraFuel;

    // --- constructors -------------------------------------------------------

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        validateFuel(extraFuel, extraCapacity);

        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    // --- getters and setters ------------------------------------------------

    public double getExtraCapacity() { return extraCapacity; }
    public double getExtraFuel() { return extraFuel; }

    // --- public methods -----------------------------------------------------

    @Override
    public void modifyFuelAmount(double fuel) {
        validateFuel(getFuel() + extraFuel + fuel, getTankCapacity() + extraCapacity);

        double refillAmountTank = super.calculateRefillAmount();
        super.modifyFuelAmount(Math.min(refillAmountTank, fuel));
        extraFuel += Math.max(0d, fuel - refillAmountTank);
    }

    @Override
    public void drive(int km) {
        validateDistanceToDrive(km);

        double fuelConsumed = (double) km * getFuelRate() / 100d;
        double fuelConsumedFromExtraCapacity = Math.min(extraFuel, fuelConsumed);
        extraFuel -= fuelConsumedFromExtraCapacity;

        double fuelConsumedOverExtraCapacity = fuelConsumed - fuelConsumedFromExtraCapacity;
        super.modifyFuelAmount(fuelConsumedOverExtraCapacity * (-1));
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    // --- protected methods --------------------------------------------------

    @Override
    protected double distanceCanBeDriven() {
        return super.distanceCanBeDriven() + extraFuel * 100d / getFuelRate();
    }
}