package sorting.webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product;
    LocalDateTime dateTime;

    @BeforeEach
    void setUp() {
        dateTime = LocalDateTime.now();
        product = new Product("Product", 1000, dateTime);
    }

    @Test
    void getNameTest() {
        assertEquals("Product", product.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, product.getPrice());
    }

    @Test
    void getDateTimeTest() {
        assertEquals(dateTime, product.getDateTime());
    }
}