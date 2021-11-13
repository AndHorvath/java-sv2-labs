package junit5fixture;

public class Ship {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int yearOfConstruction;
    private double length;

    // --- constructors -------------------------------------------------------

    public Ship(String name, int yearOfConstruction, double length) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.length = length;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getYearOfConstruction() { return yearOfConstruction; }
    public double getLength() { return length; }
}