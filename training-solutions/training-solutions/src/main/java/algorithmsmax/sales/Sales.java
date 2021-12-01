package algorithmsmax.sales;

import java.util.List;

public class Sales {

    // --- public methods -----------------------------------------------------

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersonList) {
        Salesperson selected = null;
        for (Salesperson salesperson : salespersonList) {
            if (selected == null || salesperson.getAmount() > salesperson.getAmount()) {
                selected = salesperson;
            }
        }
        return selected;
    }

    public Salesperson selectSalespersonWithFurthestAboveTarget(List<Salesperson> salespersonList) {
        return selectSalespersonWithFurthestAboveOrBelowTarget(salespersonList, true);
    }

    public Salesperson selectSalespersonWithFurthestBelowTarget(List<Salesperson> salespersonList) {
        return selectSalespersonWithFurthestAboveOrBelowTarget(salespersonList, false);
    }

    // --- private methods ----------------------------------------------------

    private Salesperson selectSalespersonWithFurthestAboveOrBelowTarget(
            List<Salesperson> salespersonList, boolean isAbove) {
        Salesperson selected = null;
        for (Salesperson salesperson : salespersonList) {
            if (selected == null || (
                    isAbove ?
                    amountAboveTarget(salesperson) > amountAboveTarget(selected) :
                    amountBelowTarget(salesperson) > amountBelowTarget(selected))) {
                selected = salesperson;
            }
        }
        return selected;
    }

    private int amountAboveTarget(Salesperson salesperson) {
        return salesperson.getAmount() - salesperson.getTarget();
    }

    private int amountBelowTarget(Salesperson salesperson) {
        return amountAboveTarget(salesperson) * (-1);
    }
}