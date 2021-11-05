package compositionlist.computer;

public class Hardware {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String model;

    // --- constructors -------------------------------------------------------

    public Hardware(String name, String model) {
        this.name = name;
        this.model = model;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString(){
        return name + " " + model;
    }
}