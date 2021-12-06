package methodparam.sums;

public class SeparatedNumbers {

    // --- attributes ---------------------------------------------------------

    private double positiveNumber;
    private double negativeNumber;

    // --- constructors -------------------------------------------------------

    public SeparatedNumbers(double positiveNumber, double negativeNumber) {
        this.positiveNumber = positiveNumber;
        this.negativeNumber = negativeNumber;
    }

    // --- getters and setters ------------------------------------------------

    public double getPositiveNumber() { return positiveNumber; }

    public double getNegativeNumber() { return negativeNumber; }
}