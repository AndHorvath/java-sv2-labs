package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers;
    int[] numbersToSum;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
        numbersToSum = new int[100];
        for (int i = 0; i < 100; i++) {
            numbersToSum[i] = i + 1;
        }
    }

    @Test
    void getSumTest() {
        int expectedSum = 5050;
        assertEquals(expectedSum, numbers.getSum(numbersToSum));
        assertEquals(1, numbers.getSum(new int[] { 1 }));
        assertEquals(0, numbers.getSum(new int[] { }));
    }
}