package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CookbookTest {

    Cookbook cookbook;
    List<Cake> cakes;

    @BeforeEach
    void setUp() {
        cakes = new ArrayList<>(List.of(
            new Cake("Cake A", new ArrayList<>(List.of("Ingredient A"))),
            new Cake("Cake B", new ArrayList<>(List.of("Ingredient A", "Ingredient B"))),
            new Cake("Cake C", new ArrayList<>(List.of("Ingredient A", "Ingredient B", "Ingredient C")))
        ));
        cookbook = new Cookbook(cakes);
    }

    @Test
    void getCakesTest() {
        assertEquals(cakes, cookbook.getCakes());
    }

    @Test
    void listCakeNamesWithGivenIngredientTest() {
        assertEquals(
            new ArrayList<>(List.of("Cake B", "Cake C")),
            cookbook.listCakeNamesWithGivenIngredient("Ingredient B")
        );
    }

    @Test
    void listCakeNamesWithMaxIngredientsTest() {
        assertEquals(
            new ArrayList<>(List.of("Cake A", "Cake B")),
            cookbook.listCakeNamesWithMaxIngredients(2)
        );
    }
}