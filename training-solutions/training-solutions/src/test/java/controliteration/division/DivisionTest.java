package controliteration.division;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {

    Division division;
    int divisor;
    int upperLimit;
    int[] expectedResult;
    List<Integer> actualResult;

    @BeforeEach
    void initDivision() {
        division = new Division();
        divisor = 3;
        upperLimit = 36;
        expectedResult = new int[] { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33 };
    }

    @Test
    void getNumbersDivisibleByAndLessThanWithForTest() {
        actualResult = division.getNumbersDivisibleByAndLessThanWithFor(divisor, upperLimit);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], actualResult.get(i));
        }
    }

    @Test
    void getNumbersDivisibleByAndLessThanWithWhileTest() {
        actualResult = division.getNumbersDivisibleByAndLessThanWithWhile(divisor, upperLimit);

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], actualResult.get(i));
        }
    }
}