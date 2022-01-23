package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    Food food;

    @BeforeEach
    void setUp() {
        food = new Food("food", LocalDate.of(2022, 2, 1));
    }

    @Test
    void getNameTest() {
        assertEquals("food", food.getName());
    }

    @Test
    void getExpiryDateTest() {
        assertEquals(2022, food.getExpiryDate().getYear());
        assertEquals(Month.FEBRUARY, food.getExpiryDate().getMonth());
        assertEquals(1, food.getExpiryDate().getDayOfMonth());
    }
}