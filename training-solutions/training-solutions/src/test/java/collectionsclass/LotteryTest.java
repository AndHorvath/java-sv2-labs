package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery;
    List<Integer> winningNumbers;
    Throwable exception;

    @BeforeEach
    void setUp() {
        lottery = new Lottery();
    }

    @Test
    void selectWinningNumbersTest() {
        winningNumbers = lottery.selectWinningNumbers(5, 90);
        assertEquals(5, winningNumbers.size());
        for (int i = 1; i < winningNumbers.size(); i++) {
            assertTrue(winningNumbers.get(i) > winningNumbers.get(i - 1));
        }
    }

    @Test
    void selectWinningNumbersTestInvalid() {
        exception = assertThrows(
            IllegalArgumentException.class, () -> lottery.selectWinningNumbers(90, 90));
        assertEquals("Invalid initial data.", exception.getMessage());
    }
}