package inheritanceattributes.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    ShippedBook shippedBook;

    @BeforeEach
    void setUp() {
        shippedBook = new ShippedBook("Egri csillagok", 1000, 500);
    }

    @Test
    void getShippingCostTest() {
        assertEquals(500, shippedBook.getShippingCost());
    }

    @Test
    void orderTest() {
        assertEquals(2500, shippedBook.order(2));
    }

    @Test
    void toStringTest() {
        assertEquals("Egri csillagok: 1000 Ft, postaköltség: 500 Ft", shippedBook.toString());
    }
}