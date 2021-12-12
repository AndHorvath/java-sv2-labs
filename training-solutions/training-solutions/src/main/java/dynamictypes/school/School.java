package dynamictypes.school;

public class School {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int numberOfYears;

    // --- constructors -------------------------------------------------------

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getNumberOfYears() { return numberOfYears; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return name + ": " + numberOfYears + " years";
    }
}