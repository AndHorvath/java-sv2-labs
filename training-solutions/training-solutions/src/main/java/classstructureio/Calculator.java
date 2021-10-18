package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger;
        int secondInteger;
        int result;

        System.out.println("Enter an integer!");
        firstInteger = scanner.nextInt();

        System.out.println("Now, enter another integer!");
        secondInteger = scanner.nextInt();

        System.out.println("Operation: " + firstInteger + " + " + secondInteger);

        result = firstInteger + secondInteger;
        System.out.println("Result: " + result);
    }
}
