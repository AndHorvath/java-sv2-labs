package lambdastreams.baseoperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    Operations operations;

    @BeforeEach
    void setUp() {
        operations = new Operations(
            new ArrayList<>(Arrays.asList(1, 0, 2, 2, 2, -1, -1, 4, 3, 5, 3, 4, 2))
        );
    }

    @Test
    void testGetIntegers() {
        assertEquals(List.of(1, 0, 2, 2, 2, -1, -1, 4, 3, 5, 3, 4, 2), operations.getIntegers());
    }

    @Test
    void testMin() {
        assertEquals(Integer.valueOf(-1), operations.min().orElse(Integer.MAX_VALUE));
    }

    @Test
    void testSum() {
        assertEquals(Integer.valueOf(26), operations.sum());
    }

    @Test
    void testIsAllPositive() {
        assertFalse(operations.isAllPositive());

        operations.getIntegers().removeIf(integer -> integer <= 0);
        assertTrue(operations.isAllPositive());
    }

    @Test
    void testGetDistinctElements() {
        assertEquals(Set.of(-1, 0, 1, 2, 3, 4, 5), operations.getDistinctElements());
    }
}