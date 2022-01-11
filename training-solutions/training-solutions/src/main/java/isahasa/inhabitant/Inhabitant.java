package isahasa.inhabitant;

public class Inhabitant extends Person {

    // --- attributes ---------------------------------------------------------

    private ParkingPlace parkingPlace;

    // --- constructors -------------------------------------------------------

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    // --- getters and setters ------------------------------------------------

    public ParkingPlace getParkingPlace() { return parkingPlace; }

    // --- public methods -----------------------------------------------------

    public void changeParkingPlace(int newNumber) {
        parkingPlace = new ParkingPlace(newNumber);
    }
}