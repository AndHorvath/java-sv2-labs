package sorting.webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    WebShop webShop;
    Product productA;
    Product productB;
    Product productC;
    LocalDateTime dateTime;

    @BeforeEach
    void setUp() {
        dateTime = LocalDateTime.now();
        productA = new Product("Product A", 2000, dateTime.plusDays(3));
        productB = new Product("Product C", 1000, dateTime.plusDays(2));
        productC = new Product("Product B", 3000, dateTime.plusDays(1));

        webShop = new WebShop(new ArrayList<>(Arrays.asList(
            productA, productB, productC
        )));
    }

    @Test
    void getProductsTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(productA, productB, productC)),
            webShop.getProducts()
        );
    }

    @Test
    void getProductsInNameOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(productA, productC, productB)),
            webShop.getProductsInNameOrder()
        );assertEquals(
            new ArrayList<>(Arrays.asList(productA, productB, productC)),
            webShop.getProducts()
        );
    }

    @Test
    void getProductsInPriceOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(productB, productA, productC)),
            webShop.getProductsInPriceOrder()
        );assertEquals(
            new ArrayList<>(Arrays.asList(productA, productB, productC)),
            webShop.getProducts()
        );
    }

    @Test
    void getProductsInDateTimeOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(productC, productB, productA)),
            webShop.getProductsInDateTimeOrder()
        );assertEquals(
            new ArrayList<>(Arrays.asList(productA, productB, productC)),
            webShop.getProducts()
        );
    }
}