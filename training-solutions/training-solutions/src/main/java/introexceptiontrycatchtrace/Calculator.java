package introexceptiontrycatchtrace;

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

    public String getCalculationResult() {
        String result;
        int a = Integer.parseInt(numberA);
        int b = Integer.parseInt(numberB);

        switch (operation) {
            case "+":
                result = Integer.toString(add(a, b));
                break;
            case "-":
                result = Integer.toString(subtract(a, b));
                break;
            case "*":
                result = Integer.toString(multiply(a, b));
                break;
            case "/":
                result = Integer.toString(divide(a, b));
                break;
            default:
                result = reportWrongOperation();
        }
        return result;
    }

    // --- private methods ----------------------------------------------------

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private String reportWrongOperation() {
        return  "No operation corresponding to your entry.";
    }
}