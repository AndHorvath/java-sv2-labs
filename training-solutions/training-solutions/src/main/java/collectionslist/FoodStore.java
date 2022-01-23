package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    // --- attributes ---------------------------------------------------------

    private List<Food> foodList;

    // --- constructors -------------------------------------------------------

    public FoodStore() {
        this.foodList = new LinkedList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Food> getFoodList() { return foodList; }

    // --- public methods -----------------------------------------------------

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void sellFirst(Food food) {
        if (food.getExpiryDate().equals(LocalDate.now())) {
            foodList.add(0, food);
        }
    }
}