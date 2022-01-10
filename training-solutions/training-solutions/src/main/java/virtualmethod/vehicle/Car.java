package virtualmethod.vehicle;

public class Car extends Vehicle {

    // --- attributes ---------------------------------------------------------

    protected int numberOfPassengers;

    // --- constructors -------------------------------------------------------

    public Car(int vehicleWeight, int numberOfPassengers) {
        super(vehicleWeight);
        this.numberOfPassengers = numberOfPassengers;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfPassengers() { return numberOfPassengers; }

    // --- public methods -----------------------------------------------------

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + PERSON_AVERAGE_WEIGHT * numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Car{numberOfPassengers=" + numberOfPassengers + ", vehicleWeight=" + getVehicleWeight() + "}";
    }
}