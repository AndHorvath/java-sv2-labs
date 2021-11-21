package introexceptiontrycatch;

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
        calculator.printCalculationResult();
    }
}