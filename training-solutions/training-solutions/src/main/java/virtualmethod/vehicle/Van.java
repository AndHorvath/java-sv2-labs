package virtualmethod.vehicle;

public class Van extends Car {

    // --- attributes ---------------------------------------------------------

    private int caroWeight;

    // --- constructors -------------------------------------------------------

    public Van(int vehicleWeight, int numberOfPassengers, int caroWeight) {
        super(vehicleWeight, numberOfPassengers);
        this.caroWeight = caroWeight;
    }

    // --- getters and setters ------------------------------------------------

    public int getCaroWeight() { return caroWeight; }

    // --- public methods -----------------------------------------------------

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + caroWeight;
    }

    @Override
    public String toString() {
        return
            "Van{caroWeight=" + caroWeight +
            ", numberOfPassengers=" + numberOfPassengers +
            ", vehicleWeight=" + getVehicleWeight() + "}";
    }
}