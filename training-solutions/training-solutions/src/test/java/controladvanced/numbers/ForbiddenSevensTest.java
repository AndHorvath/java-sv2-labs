package controladvanced.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForbiddenSevensTest {

    @Test
    void createForbiddenSevensListForJUnit() {
        ForbiddenSevens forbiddenSevens = new ForbiddenSevens();
        int initialNumber = 3;
        int[] expectedResult = { 3, 4, 5, 6, -1, 8, 9, 10, 11, 12, 13, -1, 15, 16, };

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], forbiddenSevens.createForbiddenSevensListForJUnit(initialNumber).get(i));
        }
    }
}