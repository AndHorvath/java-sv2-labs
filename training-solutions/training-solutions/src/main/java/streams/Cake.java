package streams;

import java.util.List;

public class Cake {

    // --- attributes ---------------------------------------------------------

    private String name;
    private List<String> ingredients;

    // --- constructors -------------------------------------------------------

    public Cake(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
}