package interfacestaticmethods.vehicle;

public class Bicycle implements Vehicle {

    // --- attributes ---------------------------------------------------------

    private int numberOfWheels;

    // --- constructors -------------------------------------------------------

    public Bicycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfWheels() { return numberOfWheels; }
}