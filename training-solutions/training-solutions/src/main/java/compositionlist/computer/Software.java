package compositionlist.computer;

public class Software {

    // --- attributes ---------------------------------------------------------

    private String name;
    private double numberOfVersion;

    // --- constructors -------------------------------------------------------

    public Software(String name, double numberOfVersion) {
        this.name = name;
        this.numberOfVersion = numberOfVersion;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getNumberOfVersion() { return numberOfVersion; }
    public void setNumberOfVersion(double numberOfVersion) { this.numberOfVersion = numberOfVersion; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString(){
        return name + " " + numberOfVersion;
    }
}