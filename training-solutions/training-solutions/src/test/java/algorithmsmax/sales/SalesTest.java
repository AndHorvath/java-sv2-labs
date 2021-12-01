package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales;
    List<Salesperson> salespersonList;

    @BeforeEach
    void setUp() {
        sales = new Sales();
        salespersonList = Arrays.asList(
                new Salesperson("John Doe", 5000, 4000),
                new Salesperson("Jake Doe", 6000, 8000),
                new Salesperson("Jane Doe", 4000, 2000)
        );
    }

    @Test
    void selectSalesPersonWithMaxSalesAmountTest() {
        Salesperson expectedResult = salespersonList.get(0);
        assertEquals(expectedResult, sales.selectSalesPersonWithMaxSalesAmount(salespersonList));
    }

    @Test
    void selectSalespersonWithFurthestAboveTargetTest() {
        Salesperson expectedResult = salespersonList.get(2);
        assertEquals(expectedResult, sales.selectSalespersonWithFurthestAboveTarget(salespersonList));
    }

    @Test
    void selectSalespersonWithFurthestBelowTargetTest() {
        Salesperson expectedResult = salespersonList.get(1);
        assertEquals(expectedResult, sales.selectSalespersonWithFurthestBelowTarget(salespersonList));
    }
}