package objectclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeerTest {

    Beer beer;

    @BeforeEach
    void setUp() {
        beer = new Beer("Guinness", 500);
    }

    @Test
    void getNameTest() {
        assertEquals("Guinness", beer.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(500, beer.getPrice());
    }
}