package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberA;
        String numberB;
        String operation;
        Calculator calculator;

        System.out.println("Please, enter a number!");
        numberA = scanner.nextLine();
        System.out.println("Enter another number!");
        numberB = scanner.nextLine();
        System.out.println("Chose an operation (+, -, *, /)!");
        operation = scanner.nextLine();

        calculator = new Calculator(numberA, numberB, operation);
        try {
            try {
                System.out.println(calculator.getCalculationResult());
            } catch (NumberFormatException exception) {
                System.out.println("At least one of your first two entries is not a number.");
                System.out.println(exception.getMessage());
            }
        } catch (ArithmeticException exception) {
            System.out.println("No division by zero.");
            System.out.println(exception.getMessage());
        }
    }
}