package interfacedefaultmethods.seats;

public class Car implements Seat {

    // --- attributes ---------------------------------------------------------

    private String brand;
    private int numberOfSeats;

    // --- constructors -------------------------------------------------------

    public Car(String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }

    @Override
    public int getNumberOfSeats() { return numberOfSeats; }
}