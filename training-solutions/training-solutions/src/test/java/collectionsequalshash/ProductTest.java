package collectionsequalshash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product;
    Product other;

    @BeforeEach
    void setUp() {
        product = new Product("Product", "A-1");
    }

    @Test
    void getNameTest() {
        assertEquals("Product", product.getName());
    }

    @Test
    void getRegistryNumberTest() {
        assertEquals("A-1", product.getRegistryNumber());
    }

    @Test
    void testEqualsTest() {
        other = new Product("other", "A-1");
        assertEquals(product, other);

        other = new Product("Product", "B-2");
        assertNotEquals(product, other);
    }

    @Test
    void testHashCodeTest() {
        other = new Product("other", "A-1");
        assertEquals(product.hashCode(), other.hashCode());
    }
}