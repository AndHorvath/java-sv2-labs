package streams;

import java.util.List;

public class Cookbook {

    // --- attributes ---------------------------------------------------------

    private List<Cake> cakes;

    // --- constructors -------------------------------------------------------

    public Cookbook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    // --- getters and setters ------------------------------------------------

    public List<Cake> getCakes() { return cakes; }

    // --- public methods -----------------------------------------------------

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        return cakes.stream()
            .filter(cake -> cake.getIngredients().contains(ingredient))
            .map(Cake::getName)
            .toList();
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        return cakes.stream()
            .filter(cake -> cake.getIngredients().size() <= max)
            .map(Cake::getName)
            .toList();
    }
}