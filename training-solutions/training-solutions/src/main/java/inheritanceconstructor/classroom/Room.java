package inheritanceconstructor.classroom;

public class Room {

    // --- attributes ---------------------------------------------------------

    private String location;
    private int capacity;

    // --- constructors -------------------------------------------------------

    public Room(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }

    // --- getters and setters ------------------------------------------------

    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }
}