package methodparam.sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeparatedNumbersTest {

    SeparatedNumbers separatedNumbers;

    @BeforeEach
    void setUp() {
        separatedNumbers = new SeparatedNumbers(5d, -4d);
    }

    @Test
    void getPositiveNumberTest() {
        assertEquals(5d, separatedNumbers.getPositiveNumber(), Math.pow(10d, -5d));
    }

    @Test
    void getNegativeNumberTest() {
        assertEquals(-4d, separatedNumbers.getNegativeNumber(), Math.pow(10d, -5d));
    }
}