package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    // --- attributes ---------------------------------------------------------

    private int registryNumber;
    private String description;
    private LocalDate registrationDate;

    // --- constructors -------------------------------------------------------

    public LostProperty(int registryNumber, String description, LocalDate registrationDate) {
        this.registryNumber = registryNumber;
        this.description = description;
        this.registrationDate = registrationDate;
    }

    // --- getters and setters ------------------------------------------------

    public int getRegistryNumber() { return registryNumber; }
    public String getDescription() { return description; }
    public LocalDate getRegistrationDate() { return registrationDate; }

    // --- public methods -----------------------------------------------------

    @Override
    public int compareTo(LostProperty o) {
        if (description.compareTo(o.description) != 0) {
            return description.compareTo(o.description);
        } else {
            return registrationDate.compareTo(o.registrationDate);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return
            Objects.equals(description, that.description) &&
            Objects.equals(registrationDate, that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, registrationDate);
    }
}