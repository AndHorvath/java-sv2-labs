package algorithmssum.twodigitodds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoDigitOddsTest {

    TwoDigitOdds twoDigitOdds;

    @BeforeEach
    void setUp() {
        twoDigitOdds = new TwoDigitOdds();
    }

    @Test
    void getSum() {
        int expectedSum = 1980;
        assertEquals(expectedSum, twoDigitOdds.getSum());
    }
}