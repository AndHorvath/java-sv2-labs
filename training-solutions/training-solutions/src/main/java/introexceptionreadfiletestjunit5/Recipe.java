package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    // --- attributes ---------------------------------------------------------

    private final List<String> ingredients;

    // --- constructors -------------------------------------------------------

    public Recipe() {
        ingredients = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getIngredients() { return ingredients; }

    // --- public methods -----------------------------------------------------

    public void addIngredients(Path path) {
        ingredients.addAll(readRecipe(path));
    }

    // --- private methods ----------------------------------------------------

    private List<String> readRecipe(Path path) {
        List<String> ingredients = new ArrayList<>();
        List<String> auxIngredients;
        int emptyRowIndex;
        try {
            auxIngredients = Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
        emptyRowIndex = auxIngredients.indexOf("");
        for (String ingredient : removeTitle(auxIngredients, emptyRowIndex)) {
            if (isIngredientValid(ingredient)) {
                ingredients.add(ingredient.split(" ")[2]);
            }
        }
        return ingredients;
    }

    private List<String> removeTitle(List<String> list, int emptyRowIndex) {
        return list.subList(emptyRowIndex + 1, list.size());
    }

    private boolean isIngredientValid(String ingredient) {
        if (ingredient == null ||
            ingredient.trim().length() == 0 ||
            ingredient.split(" ").length != 3) {
            throw new IllegalArgumentException("Ingredient invalid.");
        }
        return true;
    }
}