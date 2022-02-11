package sorting;

import java.util.Arrays;

public class Income {

    // --- attributes ---------------------------------------------------------

    private int[] incomes;

    // --- constructors -------------------------------------------------------

    public Income(int[] incomes) {
        this.incomes = incomes;
    }

    // --- getters and setters ------------------------------------------------

    public int[] getIncomes() { return incomes; }

    // --- public methods -----------------------------------------------------

    public int getHighestIncome() {
        Arrays.sort(incomes);
        return incomes[incomes.length - 1];
    }
}