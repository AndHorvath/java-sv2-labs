package intromethods.registration;

import java.time.LocalDate;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String email;
    private LocalDate dateOfBirth;

    // --- constructors -------------------------------------------------------

    public Person(String name, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public String getEmail() { return email; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return  "Data of the employee - Name: " + name +
                ", date of birth: " + dateOfBirth + ", email: " + email + ".";
    }
}