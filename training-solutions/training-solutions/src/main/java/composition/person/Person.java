package composition.person;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String identificationCard;
    private Address address;

    // --- constructors -------------------------------------------------------

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getIdentificationCard() { return identificationCard; }
    public Address getAddress() { return address; }

    // --- public methods -----------------------------------------------------

    public void moveTo(Address address) {
        this.address = address;
    }

    public void correctData(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public String personToString() {
        return name + " " + identificationCard + " " + (address != null ? address.addressToString() : "");
    }
}