package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevensMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ForbiddenSevens forbiddenSevens = new ForbiddenSevens();
        int initialNumber;

        System.out.println("Please, enter a natural number!");
        initialNumber = scanner.nextInt();
        forbiddenSevens.createForbiddenSevensSequence(initialNumber);
    }
}