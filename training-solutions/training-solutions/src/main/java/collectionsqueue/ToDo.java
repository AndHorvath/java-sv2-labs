package collectionsqueue;

public class ToDo {

    // --- attributes ---------------------------------------------------------

    private String description;
    private boolean isUrgent;

    // --- constructors -------------------------------------------------------

    public ToDo(String description, boolean isUrgent) {
        this.description = description;
        this.isUrgent = isUrgent;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }
    public boolean isUrgent() { return isUrgent; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return description + ": " + isUrgent;
    }
}