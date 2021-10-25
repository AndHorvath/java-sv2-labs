package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + ". number!");
            sum += scanner.nextDouble();
        }
        System.out.println("The sum is: " + sum);
    }
}