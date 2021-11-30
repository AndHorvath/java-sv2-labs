package algorithmscount.digits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    Digits digits;

    @BeforeEach
    void setUp() {
        digits = new Digits();
    }

    @Test
    void getCountOfNumbersTest() {
        int expectedResult = 9;
        assertEquals(expectedResult, digits.getCountOfNumbers());
    }
}