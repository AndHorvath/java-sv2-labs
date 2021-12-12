package introinheritance.coffee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee;

    @BeforeEach
    void setUp() {
        coffee = new Coffee();
    }

    @Test
    void getNameTest() {
        assertNull(coffee.getName());
    }

    @Test
    void setNameTest() {
        coffee.setName("Coffee");
        assertEquals("Coffee", coffee.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(0, coffee.getPrice());
    }

    @Test
    void setPriceTest() {
        coffee.setPrice(400);
        assertEquals(400, coffee.getPrice());
    }
}