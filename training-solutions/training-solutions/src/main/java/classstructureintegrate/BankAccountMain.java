package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountDataPrinter accountDataPrinter = new BankAccountDataPrinter();
        BankAccount bankAccount;
        String accountNumber;
        String owner;
        int amountOfTransaction;

        System.out.println("Please, enter the name of the bank account owner.");
        owner = scanner.nextLine();
        System.out.println("Enter the account number!");
        accountNumber = scanner.nextLine();

        bankAccount = new BankAccount(accountNumber, owner, 0);
        accountDataPrinter.printAccountData(bankAccount);

        System.out.println("Specify the amount you want to deposit!");
        amountOfTransaction = scanner.nextInt();
        scanner.nextLine();

        bankAccount.deposit(amountOfTransaction);
        accountDataPrinter.printAccountData(bankAccount);

        System.out.println("Now, specify the amount you want to withdraw!");
        amountOfTransaction = scanner.nextInt();

        bankAccount.withdraw(amountOfTransaction);
        accountDataPrinter.printAccountData(bankAccount);
    }
}