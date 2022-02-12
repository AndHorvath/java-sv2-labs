package lambda;

public class Sapling {

    // --- attributes ---------------------------------------------------------

    private String species;
    private int height;

    // --- constructors -------------------------------------------------------

    public Sapling(String species, int height) {
        this.species = species;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public String getSpecies() { return species; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    // --- public methods -----------------------------------------------------

    public void cut(int maxHeight) {
        if (height > maxHeight) {
            setHeight(maxHeight);
        }
    }
}