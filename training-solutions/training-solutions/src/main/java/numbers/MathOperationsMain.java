package numbers;

import java.util.Scanner;

public class MathOperationsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOperations = new MathOperations();
        double userSolution;
        double solution;

        System.out.println("What is (1,1 * 1,1 + 0,11) : 1,2 - 0,3 * 0,3?");
        userSolution = scanner.nextDouble();
        solution = (1.1D * 1.1D + 0.11D) / 1.2D - 0.3D * 0.3D;
        System.out.println("You're " + (mathOperations.isEqual(userSolution, solution) ? "right." : "wrong."));
    }
}