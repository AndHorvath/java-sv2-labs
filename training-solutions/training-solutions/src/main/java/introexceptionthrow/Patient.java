package introexceptionthrow;

public class Patient {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    // --- constructors -------------------------------------------------------

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("A name must be given.");
        }
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Year of birth cannot be before 1900.");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public int getYearOfBirth() { return yearOfBirth; }
}