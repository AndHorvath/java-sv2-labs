package inheritancemethods.employee;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String address;

    // --- constructors -------------------------------------------------------

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getAddress() { return address; }

    // --- public methods -----------------------------------------------------

    public void migrate(String newAddress) {
        address = newAddress;
    }
}