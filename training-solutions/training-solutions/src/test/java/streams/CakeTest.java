package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CakeTest {

    Cake cake;
    List<String> ingredients;

    @BeforeEach
    void setUp() {
        ingredients = new ArrayList<>(List.of("Ingredient A", "Ingredient B"));
        cake = new Cake("Cake", ingredients);
    }

    @Test
    void getNameTest() {
        assertEquals("Cake", cake.getName());
    }

    @Test
    void getIngredientsTest() {
        assertEquals(ingredients, cake.getIngredients());
    }
}