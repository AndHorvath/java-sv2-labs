package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isDivisibleByThree;
        String stringInfix;

        System.out.println("Please, enter a whole number!");
        number = scanner.nextInt();

        isDivisibleByThree = number % 3 == 0;
        stringInfix = isDivisibleByThree ? " " : " not ";

        System.out.println(number + " is" + stringInfix + "divisible by 3.");
    }
}
