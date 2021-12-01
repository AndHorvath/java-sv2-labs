package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    Salesperson salesperson;

    @BeforeEach
    void setUp() {
        salesperson = new Salesperson("John Doe", 2000, 1000);
    }

    @Test
    void getNameTest() {
        String expectedName = "John Doe";
        assertEquals(expectedName, salesperson.getName());
    }

    @Test
    void getAmountTest() {
        int expectedAmount = 2000;
        assertEquals(expectedAmount, salesperson.getAmount());
    }

    @Test
    void getTargetTest() {
        int expectedTarget = 1000;
        assertEquals(expectedTarget, salesperson.getTarget());
    }
}