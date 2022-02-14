package streamsalgorithms;

public class Employee {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int yearOfBirth;

    // --- constructors -------------------------------------------------------

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getYearOfBirth() { return yearOfBirth; }
}