package methodparam.sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    SeparatedSum separatedSum;
    String pathString;

    @BeforeEach
    void setUp() {
        separatedSum = new SeparatedSum();
        pathString = "src/test/resources/floatingnumbers.txt";
    }

    @Test
    void sumTest() {
        double expectedResultPositive = 110.6d;
        double expectedResultNegative = -153.3d;
        double actualResultPositive = separatedSum.sum(separatedSum.getNumbersString(pathString)).getPositiveNumber();
        double actualResultNegative = separatedSum.sum(separatedSum.getNumbersString(pathString)).getNegativeNumber();
        assertEquals(expectedResultPositive, actualResultPositive, Math.pow(10d, -5d));
        assertEquals(expectedResultNegative, actualResultNegative, Math.pow(10d, -5d));
    }

    @Test
    void getNumbersStringTest() {
        String expectedResult = "12,8;25,7;-84,9;72,1;-52,8;-15,6";
        String actualResult = separatedSum.getNumbersString(pathString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getNumberStingTextException() {
        String pathStringException = "src/test/resources/doublenumbers.txt";
        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> separatedSum.getNumbersString(pathStringException));
        assertEquals("Cannot read file.", exception.getMessage());
    }
}