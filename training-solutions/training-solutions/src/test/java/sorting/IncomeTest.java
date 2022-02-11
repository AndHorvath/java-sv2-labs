package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    Income income;

    @BeforeEach
    void setUp() {
        income = new Income(new int[] {
           11, 33, 99, 55, 77, 66, 88, 22, 44
        });
    }

    @Test
    void getIncomesTest() {
        assertArrayEquals(
            new int[] { 11, 33, 99, 55, 77, 66, 88, 22, 44 },
            income.getIncomes());
    }

    @Test
    void getHighestIncomeTest() {
        assertEquals(99, income.getHighestIncome());
    }
}