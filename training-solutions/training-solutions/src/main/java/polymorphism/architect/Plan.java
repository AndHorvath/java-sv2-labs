package polymorphism.architect;

public abstract class Plan {

    // --- attributes ---------------------------------------------------------

    protected int pagesOfDocumentation;

    // --- constructors -------------------------------------------------------

    public Plan(int pagesOfDocumentation) {
        this.pagesOfDocumentation = pagesOfDocumentation;
    }

    // --- public methods -----------------------------------------------------

    public abstract int getPagesOfDocumentation();
}