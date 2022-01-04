package interfacestaticmethods.vehicle;

public class Car implements Vehicle {

    // --- attributes ---------------------------------------------------------

    private String brand;
    private int numberOfWheels;

    // --- constructors -------------------------------------------------------

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand, int numberOfWheels) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }
    public int getNumberOfWheels() { return numberOfWheels; }
}