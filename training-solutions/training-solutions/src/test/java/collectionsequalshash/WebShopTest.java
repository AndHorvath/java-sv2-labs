package collectionsequalshash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    WebShop webShop;
    Product product;

    @BeforeEach
    void setUp() {
        webShop = new WebShop();
        product = new Product("Product A", "A-1");
    }

    @Test
    void getProductsTest() {
        assertEquals(0, webShop.getProducts().size());
    }

    @Test
    void addProductTest() {
        webShop.addProduct(product);
        assertEquals(1, webShop.getProducts().size());
        assertEquals("Product A", webShop.getProducts().get(0).getName());
        assertEquals("A-1", webShop.getProducts().get(0).getRegistryNumber());
    }

    @Test
    void findHowManyTest() {
        webShop.addProduct(new Product("Product A", "A-1"));
        assertEquals(1, webShop.findHowMany(product));

        webShop.addProduct(new Product("Product A", "B-2"));
        assertEquals(1, webShop.findHowMany(product));

        webShop.addProduct(new Product("Product B", "A-1"));
        assertEquals(2, webShop.findHowMany(product));
    }
}