package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe;
    Path path;

    @BeforeEach
    void setUp() {
        recipe = new Recipe();
        path = Paths.get("src/test/resources/recipe.txt");
    }

    @Test
    void getIngredientsTest() {
        recipe.addIngredients(path);
        assertEquals(10, recipe.getIngredients().size());
    }

    @Test
    void addIngredientsTestWithValidEntries() {
        recipe.addIngredients(path);
        List<String> expectedList = Arrays.asList(
                "liszt", "margarin", "kristálycukor", "tojás", "citrom",
                "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"
        );
        assertEquals(expectedList, recipe.getIngredients());
    }

    @Test
    void addIngredientsTestWithInvalidEntries() {
        path = Paths.get("src/test/resources/recipeinvalid.txt");
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> recipe.addIngredients(path));
        assertEquals("Ingredient invalid.", exception.getMessage());
    }

    @Test
    void addIngredientsTestWithoutFile() {
        path = Paths.get("src/test/resources/recipewithoutfile.txt");
        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> recipe.addIngredients(path));
        assertEquals("Cannot read file.", exception.getMessage());
    }
}