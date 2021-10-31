package finalmodifier;

public class TaxCalculatorMain {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        double netPrice = 1000;
        double tax;
        double grossPrice;

        tax = taxCalculator.tax(netPrice);
        grossPrice = taxCalculator.priceWithTax(netPrice);

        System.out.println("Net price is: " + netPrice);
        System.out.println("Tax is: " + tax);
        System.out.println("Gross price is: " + grossPrice);
    }
}
