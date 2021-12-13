package inheritanceattributes;

public class Building {

    // --- attributes ---------------------------------------------------------

    protected String name;
    protected double area;

    private int floors;

    // --- constructors -------------------------------------------------------

    public Building(String name, double area, int floors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
    }

    // --- getters and setters ------------------------------------------------

    public int getFloors() { return floors; }
}