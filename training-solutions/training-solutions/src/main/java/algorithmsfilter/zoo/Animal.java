package algorithmsfilter.zoo;

public class Animal {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int numberOfLegs;

    // --- constructors -------------------------------------------------------

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getNumberOfLegs() { return numberOfLegs; }
}