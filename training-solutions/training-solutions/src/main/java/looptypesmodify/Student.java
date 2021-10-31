package looptypesmodify;

public class Student {

    // --- attributes ---------------------------------------------------------

    private String name;
    private boolean active;

    // --- constructors -------------------------------------------------------

    public Student(String name) { this.name = name; active = true; }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean getActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
