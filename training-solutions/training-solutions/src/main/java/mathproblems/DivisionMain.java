package mathproblems;

import java.util.Arrays;

public class DivisionMain {

    public static void main(String[] args) {
        Division division = new Division();

        division.getDivisors(3277);

        division.getRightNumbers(new int[] { 2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10 });
    }
}