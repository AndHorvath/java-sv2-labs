package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    // --- public methods -----------------------------------------------------

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder result = new StringBuilder();
        for (String item : billItems) {
            result.append(createBillItem(item.split(";"))).append("\n");
        }
        return result.substring(0, result.length() - 1);
    }

    // --- private methods ----------------------------------------------------

    private String createBillItem(String[] itemArray) {
        String product = itemArray[0];
        String unitPrice = itemArray[1];
        String amount = itemArray[2];
        return
            product + "; darabszám: " + amount + ", egységár: " +
            unitPrice + ", összesen: " + getPrice(unitPrice, amount) + " Ft";
    }

    private int getPrice(String unitPrice, String amount) {
        try {
            return Integer.parseInt(unitPrice) * Integer.parseInt(amount);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Invalid number format.", exception);
        }
    }
}