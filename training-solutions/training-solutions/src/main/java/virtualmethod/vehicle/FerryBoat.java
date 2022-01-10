package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {

    // --- attributes ---------------------------------------------------------

    public static final int MAX_CARRY_WEIGHT = 1500;
    private Car car;

    // --- constructors -------------------------------------------------------

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    // --- getters and setters ------------------------------------------------

    public Car getCar() { return car; }

    // --- public methods -----------------------------------------------------

    public boolean canCarry (Car car) {
        return car.getGrossLoad() <= MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
        }
        return canCarry(car);
    }

    @Override
    public int getGrossLoad() {
        int carryWeight = car != null ? car.getGrossLoad() : 0;
        return super.getGrossLoad() + carryWeight;
    }

    @Override
    public String toString() {
        return "FerryBoat{car=" + car.toString() + "}";
    }
}