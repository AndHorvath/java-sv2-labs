package mathproblems;

import java.util.ArrayList;
import java.util.List;

public class Division {

    public void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }

    public void getRightNumbers(int[] numbers) {
        String resultString = "";

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0) {
                resultString += numbers[i] + ", ";
            }
        }
        System.out.println(resultString.substring(0, resultString.length() - 2));
    }
}