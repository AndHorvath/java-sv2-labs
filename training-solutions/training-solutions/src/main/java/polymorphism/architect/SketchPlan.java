package polymorphism.architect;

public class SketchPlan extends Plan {

    // --- attributes ---------------------------------------------------------

    protected String title;

    // --- constructors -------------------------------------------------------

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public int getPagesOfDocumentation() { return pagesOfDocumentation; }

    public String getTitle() { return title; }
}