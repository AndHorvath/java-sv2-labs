package controliteration.division;

import java.util.Scanner;

public class DivisionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();
        int divisor;
        int upperLimit;

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiírni.");
        upperLimit = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        divisor = scanner.nextInt();

        System.out.println(
                "A kívánt számok: " + division.getNumbersDivisibleByAndLessThanWithFor(divisor, upperLimit));
        System.out.println(
                "A kívánt számok: " + division.getNumbersDivisibleByAndLessThanWithWhile(divisor, upperLimit));
    }
}