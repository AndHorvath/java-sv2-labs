package lambda;

import java.util.List;

public class TreeNursery {

    // --- attributes ---------------------------------------------------------

    private List<Sapling> saplings;

    // --- constructors -------------------------------------------------------

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    // --- getters and setters ------------------------------------------------

    public List<Sapling> getSaplings() { return saplings; }

    // --- public methods -----------------------------------------------------

    public void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(
            sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() >= minHeight);
    }
}