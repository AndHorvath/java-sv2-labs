package collectionscomp;

public class Student {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int height;

    // --- constructors -------------------------------------------------------

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getHeight() { return height; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return "Name: " + name + ", height: " + height;
    }
}