package immutable;

import java.time.LocalDate;

public class Monument {

    // --- attributes ---------------------------------------------------------

    private final String name;
    private final String address;
    private final String registryNumber;
    private final LocalDate dateOfRegistration;

    // --- constructors -------------------------------------------------------

    public Monument(String name, String address, String registryNumber, LocalDate dateOfRegistration) {
        validateParameters(name, address, registryNumber);

        this.name = name;
        this.address = address;
        this.registryNumber = registryNumber;
        this.dateOfRegistration = dateOfRegistration;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getAddress() {  return address; }
    public String getRegistryNumber() { return registryNumber; }
    public LocalDate getDateOfRegistration() { return dateOfRegistration; }

    // --- private methods ----------------------------------------------------

    private void validateParameters(String name, String address, String registryNumber) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(registryNumber)) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
    }

    private boolean isEmpty(String parameter) {
        return parameter == null || parameter.trim().length() == 0;
    }
}