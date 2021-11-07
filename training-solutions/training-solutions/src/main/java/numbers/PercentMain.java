package numbers;

import java.util.Scanner;

public class PercentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Percent percent = new Percent();
        int base;
        int value;
        int percentage;

        // --- get value ------------------------------------------------------

        System.out.println("Please, enter a whole number!");
        base = scanner.nextInt();
        System.out.println("Now, specify a percentage, as a natural number as well!");
        percentage = scanner.nextInt();
        System.out.println(
                "The value of the given percentage of the given number is: " + percent.getValue(base, percentage));

        // --- get base -------------------------------------------------------

        System.out.println("Please, enter a value as a whole number!");
        value = scanner.nextInt();
        System.out.println("Now, specify a percentage, as a natural number as well!");
        percentage = scanner.nextInt();
        System.out.println(
                "The number, whose given percentage is the given value, is: " + percent.getBase(value, percentage));

        // --- get percent ----------------------------------------------------

        System.out.println("Please, enter a whole number!");
        base = scanner.nextInt();
        System.out.println("Now, specify a value, as a whole number as well!");
        value = scanner.nextInt();
        System.out.println(
                "The given value is " + percent.getPercent(base, value) + " percent of the given number.");
    }
}