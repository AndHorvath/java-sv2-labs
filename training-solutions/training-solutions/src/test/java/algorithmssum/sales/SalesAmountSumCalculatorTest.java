package algorithmssum.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    SalesAmountSumCalculator salesAmountSumCalculator;
    List<Salesperson> salespersonList;

    @BeforeEach
    void setUp() {
        salesAmountSumCalculator = new SalesAmountSumCalculator();
        salespersonList = new ArrayList<>(Arrays.asList(
                new Salesperson("John Doe", 1000),
                new Salesperson("Jack Doe", 2000),
                new Salesperson("Jane Doe", 3000)
        ));
    }

    @Test
    void sumSalesAmountTest() {
        int expectedAmountSum = 6000;
        assertEquals(expectedAmountSum, salesAmountSumCalculator.sumSalesAmount(salespersonList));
    }
}