package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header {

    // --- attributes ---------------------------------------------------------

    protected String nameOfClient;
    protected String addressOfBuilding;

    // --- constructors -------------------------------------------------------

    public PermitPlan(
        int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {

        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public String getNameOfClient() { return nameOfClient; }

    @Override
    public String getAddressOfBuilding() { return addressOfBuilding; }

    // --- public methods -----------------------------------------------------

    public String getHeader() {
        return getTitle() + "\n" + getNameOfClient() + "\n" + getAddressOfBuilding();
    }
}