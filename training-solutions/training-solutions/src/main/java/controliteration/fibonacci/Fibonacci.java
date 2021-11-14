package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> getFibonacciNumbersWithFor(int lengthOfSequence) {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        for (int i = 0; i < lengthOfSequence; i++) {
            if (i == 0) {
                fibonacciNumbers.add(0);
            } else if (i == 1) {
                fibonacciNumbers.add(1);
            } else {
                fibonacciNumbers.add(fibonacciNumbers.get(i - 2) + fibonacciNumbers.get(i - 1));
            }
        }
        return fibonacciNumbers;
    }

    public List<Integer> getFibonacciNumbersWithWhile(int lengthOfSequence) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int actualIndex = 0;

        while (actualIndex < lengthOfSequence) {
            if (actualIndex == 0) {
                fibonacciNumbers.add(0);
            } else if (actualIndex == 1) {
                fibonacciNumbers.add(1);
            } else {
                fibonacciNumbers.add(
                        fibonacciNumbers.get(actualIndex - 2) + fibonacciNumbers.get(actualIndex - 1));
            }
            actualIndex++;
        }
        return fibonacciNumbers;
    }
}