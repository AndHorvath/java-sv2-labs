package exceptionmulticatch.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    BinaryStringConverter binaryStringConverter;
    boolean[] booleanArray;
    Throwable exception;

    @BeforeEach
    void setUp() {
        binaryStringConverter = new BinaryStringConverter();
    }

    @Test
    void binaryStringToBooleanArrayTest() {
        booleanArray = new boolean[] { true, false, true };
        assertArrayEquals(
            booleanArray, binaryStringConverter.binaryStringToBooleanArray("101"));
    }

    @Test
    void binaryStringToBooleanArrayTestNull() {
        exception = assertThrows(
            NullPointerException.class,
            () -> binaryStringConverter.binaryStringToBooleanArray(null));
        assertEquals("Binary string cannot be null.", exception.getMessage());
    }

    @Test
    void binaryStringToBooleanArrayTestEmpty() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> binaryStringConverter.binaryStringToBooleanArray(""));
        assertEquals("Invalid binary string.", exception.getMessage());
    }

    @Test
    void binaryStringToBooleanArrayTestInvalid() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> binaryStringConverter.binaryStringToBooleanArray("121"));
        assertEquals("Invalid binary string.", exception.getMessage());
    }

    @Test
    void booleanArrayToBinaryStringTest() {
        booleanArray = new boolean[] { true, false, true };
        assertEquals(
            "101", binaryStringConverter.booleanArrayToBinaryString(booleanArray));
    }

    @Test
    void booleanArrayToBinaryStringTestNull() {
        exception = assertThrows(
            NullPointerException.class,
            () -> binaryStringConverter.booleanArrayToBinaryString(null));
        assertEquals("Boolean array cannot be null.", exception.getMessage());
    }

    @Test
    void booleanArrayToBinaryStringTestEmpty() {
        booleanArray = new boolean[] { };
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> binaryStringConverter.booleanArrayToBinaryString(booleanArray));
        assertEquals("Invalid boolean array.", exception.getMessage());
    }
}