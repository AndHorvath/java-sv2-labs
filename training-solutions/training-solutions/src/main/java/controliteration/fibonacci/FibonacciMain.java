package controliteration.fibonacci;

import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        int numberOfFibonacciNumbers;

        System.out.println("Please, specify the length of the Fibonacci sequence you want to be displayed.");
        numberOfFibonacciNumbers = scanner.nextInt();

        System.out.println(fibonacci.getFibonacciNumbersWithFor(numberOfFibonacciNumbers));
        System.out.println(fibonacci.getFibonacciNumbersWithWhile(numberOfFibonacciNumbers));
    }
}
