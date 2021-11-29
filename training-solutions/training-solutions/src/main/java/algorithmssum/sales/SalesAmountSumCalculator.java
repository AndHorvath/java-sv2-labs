package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salespersonList) {
        int amountSum = 0;
        for (Salesperson salesperson : salespersonList) {
            amountSum += salesperson.getAmount();
        }
        return amountSum;
    }
}