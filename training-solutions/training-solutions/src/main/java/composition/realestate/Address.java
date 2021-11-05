package composition.realestate;

import java.util.List;

public class Address {

    // --- attributes ---------------------------------------------------------

    private String city;
    private String zipCode;
    private String street;
    private int houseNumber;

    // --- constructors -------------------------------------------------------

    public Address(String city, String zipCode, String street, int houseNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public int getHouseNumber() { return houseNumber; }
    public void setHouseNumber(int houseNumber) { this.houseNumber = houseNumber; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return city + " " + zipCode + " " + street + " " + houseNumber;
    }
}