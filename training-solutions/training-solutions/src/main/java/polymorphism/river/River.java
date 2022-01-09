package polymorphism.river;

public abstract class River implements Water {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int length;

    // --- constructors -------------------------------------------------------

    public River(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getLength() { return length; }
}