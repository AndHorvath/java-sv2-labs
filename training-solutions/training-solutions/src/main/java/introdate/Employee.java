package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    // --- attributes ---------------------------------------------------------

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    // --- constructors --------------------------------------------------------

    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.beginEmployment = LocalDateTime.now();
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDateOfBirth() { return this.dateOfBirth; }

    public LocalDateTime getBeginEmployment() { return this.beginEmployment; }
}