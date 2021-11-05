package composition.person;

public class Address {

    // --- attributes ---------------------------------------------------------

    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    // --- constructors -------------------------------------------------------

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    // --- getters and setters ------------------------------------------------

    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getStreetAndNumber() { return streetAndNumber; }
    public String getZipCode() { return zipCode; }

    // --- public methods -----------------------------------------------------

    public void correctData(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String addressToString() {
        return country + " " + city + " " + streetAndNumber + " " + zipCode;
    }
}