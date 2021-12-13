package inheritanceattributes;

public class SchoolBuilding extends Building {

    // --- attributes ---------------------------------------------------------

    private int numberOfClassRooms;

    // --- constructors -------------------------------------------------------

    public SchoolBuilding(String name, double area, int floors, int numberOfClassRooms) {
        super(name, area, floors);
        this.numberOfClassRooms = numberOfClassRooms;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfClassRooms() { return numberOfClassRooms; }
}