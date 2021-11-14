package controliteration.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    Fibonacci fibonacci;
    int lengthOfSequence;
    int[] expectedResult;
    List<Integer> actualResult;

    @BeforeEach
    void initFibonacci() {
        fibonacci = new Fibonacci();
        lengthOfSequence = 14;
        expectedResult = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 };
    }

    @Test
    void getFibonacciNumbersWithForTest() {
        actualResult = fibonacci.getFibonacciNumbersWithFor(lengthOfSequence);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], actualResult.get(i));
        }
    }

    @Test
    void getFibonacciNumbersWithWhileTest() {
        actualResult = fibonacci.getFibonacciNumbersWithWhile(lengthOfSequence);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], actualResult.get(i));
        }
    }
}
