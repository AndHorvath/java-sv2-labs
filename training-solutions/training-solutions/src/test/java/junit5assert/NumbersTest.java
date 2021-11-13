package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] numbersArray = new int[] { 2, 8, 5, 6, 2, 3, 9 };
        int[] resultArray = numbers.getEvenNumbers(numbersArray);
        int[] expectedArray = new int[] { 0, 0, 5, 0, 0, 3, 9 };

        assertArrayEquals(expectedArray, resultArray);
    }
}