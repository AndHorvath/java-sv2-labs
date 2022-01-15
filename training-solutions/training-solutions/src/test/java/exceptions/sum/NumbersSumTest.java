package exceptions.sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        numbersSum = new NumbersSum();
    }

    @Test
    void getSumIntegerTest() {
        assertEquals(6, numbersSum.getSum(new int[] { 1, 2, 3 }));
    }

    @Test
    void getSumIntegerNullTest() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> numbersSum.getSum((int[]) null));
        assertEquals("Parameter cannot be null.", exception.getMessage());
    }

    @Test
    void getSumStringTest() {
        assertEquals(6, numbersSum.getSum(new String[] { "1", "2", "3" }));
    }

    @Test
    void getSumStringNullTest() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> numbersSum.getSum((String[]) null));
        assertEquals("Parameter cannot be null.", exception.getMessage());
    }

    @Test
    void getSumStringInvalidNumberTest() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> numbersSum.getSum(new String[] { "1", "2", "a" }));
        assertEquals("Wrong number format.", exception.getMessage());
    }
}