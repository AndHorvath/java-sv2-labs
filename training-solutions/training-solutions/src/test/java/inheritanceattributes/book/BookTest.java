package inheritanceattributes.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Egri csillagok", 1000);
    }

    @Test
    void getTitleTest() {
        assertEquals("Egri csillagok", book.getTitle());
    }

    @Test
    void protectedPriceAttributeTest() {
        assertEquals(1000, book.price);
    }

    @Test
    void purchaseTest() {
        assertEquals(2000, book.purchase(2));
    }
}