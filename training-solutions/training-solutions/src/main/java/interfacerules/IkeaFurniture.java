package interfacerules;

public class IkeaFurniture implements Name, Length, Width {

    // --- attributes ---------------------------------------------------------

    private String name;
    private double length;
    private double with;

    // --- constructors -------------------------------------------------------

    public IkeaFurniture(String name, double length, double with) {
        this.name = name;
        this.length = length;
        this.with = with;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public String getName() { return name; }

    @Override
    public double gerLength() { return length; }

    @Override
    public double getWidth() { return with; }
}