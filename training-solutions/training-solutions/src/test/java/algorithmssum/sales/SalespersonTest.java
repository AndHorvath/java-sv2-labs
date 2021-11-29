package algorithmssum.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    Salesperson salesperson;

    @BeforeEach
    void setUp() {
        salesperson = new Salesperson("John Doe", 1000);
    }

    @Test
    void getNameTest() {
        String expectedName = "John Doe";
        assertEquals(expectedName, salesperson.getName());
    }

    @Test
    void getAmountTest() {
        int expectedAmount = 1000;
        assertEquals(expectedAmount, salesperson.getAmount());
    }
}