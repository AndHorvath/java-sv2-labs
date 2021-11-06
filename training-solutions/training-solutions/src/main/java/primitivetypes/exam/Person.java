package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double gradeAverage;

    // --- constructors -------------------------------------------------------

    public Person(String name, LocalDate dateOfBirth, int zipCode, double gradeAverage) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.gradeAverage = gradeAverage;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int getZipCode() { return zipCode; }

    public double getGradeAverage() { return gradeAverage; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return name + " " + dateOfBirth + " " + zipCode + " " + gradeAverage;
    }
}