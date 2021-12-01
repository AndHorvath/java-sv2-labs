package algorithmsdecision.primes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    Prime prime;
    List<Integer> numbersToHundred;
    List<Integer> primesToHundred;
    List<Integer> actualResult;

    @BeforeEach
    void setUp() {
        prime = new Prime();
        numbersToHundred = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbersToHundred.add(i);
        }
        primesToHundred = Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        );
        actualResult = new ArrayList<>();
    }

    @Test
    void isPrimeTest() {
        for (int number : numbersToHundred) {
            if (prime.isPrime(number)) {
                actualResult.add(number);
            }
        }
        assertEquals(primesToHundred, actualResult);
    }
}