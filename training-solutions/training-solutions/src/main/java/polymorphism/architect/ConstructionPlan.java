package polymorphism.architect;

public class ConstructionPlan extends PermitPlan {

    // --- attributes ---------------------------------------------------------

    private int sheetsOfConstructionDrawings;

    // --- constructors -------------------------------------------------------

    public ConstructionPlan(
        int pagesOfDocumentation, String title, String nameOfClient,
        String addressOfBuilding, int sheetsOfConstructionDrawings) {

        super(pagesOfDocumentation, title, nameOfClient, addressOfBuilding);
        this.sheetsOfConstructionDrawings = sheetsOfConstructionDrawings;
    }

    // --- getters and setters ------------------------------------------------

    public int getSheetsOfConstructionDrawings() { return sheetsOfConstructionDrawings; }
}