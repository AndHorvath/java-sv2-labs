package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    Remainder remainder;
    List<Integer> numbers;

    @BeforeEach
    void setUp() {
        remainder = new Remainder();
        numbers = new ArrayList<>(Arrays.asList(45, 13, 64, 51, 92, 33));
    }

    @Test
    void changeNumbersToRemindersTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(0, 1, 1, 0, 2, 0)),
            remainder.changeNumbersToReminders(numbers, 3));
    }
}