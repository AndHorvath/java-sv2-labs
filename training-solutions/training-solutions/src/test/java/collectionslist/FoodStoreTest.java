package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    FoodStore foodStore;
    Food food;

    @BeforeEach
    void setUp() {
        foodStore = new FoodStore();
        food = new Food("food", LocalDate.of(2022, 2, 1));
    }

    @Test
    void getFoodListTest() {
        assertEquals(new LinkedList<>(), foodStore.getFoodList());
    }

    @Test
    void addFoodTest() {
        foodStore.addFood(food);
        assertEquals(1, foodStore.getFoodList().size());
        assertEquals("food", foodStore.getFoodList().get(0).getName());
        assertEquals(LocalDate.of(2022, 2, 1), foodStore.getFoodList().get(0).getExpiryDate());
    }

    @Test
    void sellFirstTest() {
        foodStore.addFood(food);
        foodStore.addFood(food);
        foodStore.addFood(food);
        assertEquals(LocalDate.of(2022, 2, 1), foodStore.getFoodList().get(0).getExpiryDate());

        foodStore.sellFirst(new Food("other food", LocalDate.now()));
        assertEquals("other food", foodStore.getFoodList().get(0).getName());
        assertEquals(LocalDate.now(), foodStore.getFoodList().get(0).getExpiryDate());
    }
}