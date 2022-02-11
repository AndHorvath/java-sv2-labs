package sorting.surgery;

import java.time.LocalDateTime;

public class Patient {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String socialSecurityNumber;
    private LocalDateTime time;

    // --- constructors -------------------------------------------------------

    public Patient(String name, String socialSecurityNumber, LocalDateTime time) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.time = time;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public LocalDateTime getTime() { return time; }
}