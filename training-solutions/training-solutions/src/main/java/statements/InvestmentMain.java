package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Investment investment;
        int fund;
        int interestRate;
        int numberOfDays;
        int numberOfDaysAfterOneYear;

        System.out.println("Enter the investment amount!");
        fund = scanner.nextInt();

        System.out.println("Enter the interest rate!");
        interestRate = scanner.nextInt();

        System.out.println("Specify a period in days. The yield of your investment will be calculated.");
        numberOfDays = scanner.nextInt();

        System.out.println("After one year you can close your investment. Specify a period in days.");
        numberOfDaysAfterOneYear = scanner.nextInt();

        investment = new Investment(fund, interestRate);

        System.out.println("Investment data");
        System.out.println("Amount: " + fund);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Yield after " + numberOfDays + " days: " + investment.getYield(numberOfDays));
        System.out.println(
                "Value of investment after " +
                        numberOfDaysAfterOneYear + " days: " + investment.close(numberOfDaysAfterOneYear));

        System.out.println("Now, try to close the investment once again. Specify a period in days.");
        numberOfDaysAfterOneYear = scanner.nextInt();

        System.out.println(
                "Value of investment after " +
                        numberOfDaysAfterOneYear + " days: " + investment.close(numberOfDaysAfterOneYear));
    }
}
