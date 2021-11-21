package introexceptiontrycatch;

import java.util.SplittableRandom;

public class Calculator {

    // --- attributes ---------------------------------------------------------

    private String numberA;
    private String numberB;
    private String operation;

    // --- constructors -------------------------------------------------------

    public Calculator(String numberA, String numberB, String  operation) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.operation = operation;
    }

    // --- getters and setters ------------------------------------------------

    public String getNumberA() { return numberA; }
    public String getNumberB() { return numberB; }
    public String getOperation() { return operation; }

    // --- public methods -----------------------------------------------------

    public void printCalculationResult() {
        int A;
        int B;
        int result;

        try {
            A = Integer.parseInt(numberA);
            B = Integer.parseInt(numberB);
        } catch (NumberFormatException exception) {
            reportNumberFormatException(exception);
            return;
        }
        try {
            switch (operation) {
                case "+":
                    result = A + B;
                    break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    result = A / B;
                    break;
                default:
                    reportWrongOperation();
                    return;
            }
            System.out.println(result);
        } catch (ArithmeticException exception) {
            reportArithmeticException(exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private void reportNumberFormatException(NumberFormatException exception) {
        System.out.println("At least one of your first two entries is not a number.");
        System.out.println(exception.getMessage());
    }

    private void reportArithmeticException(ArithmeticException exception) {
        System.out.println("No division by zero.");
        System.out.println(exception.getMessage());
    }

    private void reportWrongOperation() {
        System.out.println("No operation corresponding to your entry.");
    }
}