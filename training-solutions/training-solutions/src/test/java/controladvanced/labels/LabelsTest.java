package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

    @Test
    void getTableOfNumbersTest() {
        Labels labels = new Labels();
        int size = 15;
        int i = 7;
        int j = 8;
        int expectedValue = 17;
        int actualValue = labels.getTableOfNumbers(size)[i][j];

        assertEquals(expectedValue, actualValue);
    }
}