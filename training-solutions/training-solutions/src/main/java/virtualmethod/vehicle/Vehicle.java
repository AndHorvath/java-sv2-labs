package virtualmethod.vehicle;

public class Vehicle {

    // --- attributes ---------------------------------------------------------

    public static final int PERSON_AVERAGE_WEIGHT = 75;
    private int vehicleWeight;

    // --- constructors -------------------------------------------------------

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    // --- getters and setters ------------------------------------------------

    public int getVehicleWeight() { return vehicleWeight; }

    // --- public methods -----------------------------------------------------

    public int getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Vehicle{vehicleWeight=" + vehicleWeight + "}";
    }
}