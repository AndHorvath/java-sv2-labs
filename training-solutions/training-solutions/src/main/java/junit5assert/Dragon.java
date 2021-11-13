package junit5assert;

public class Dragon {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int numberOfHeads;
    private double height;

    // --- constructors -------------------------------------------------------

    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getNumberOfHeads() { return numberOfHeads; }
    public double getHeight() { return height; }
}