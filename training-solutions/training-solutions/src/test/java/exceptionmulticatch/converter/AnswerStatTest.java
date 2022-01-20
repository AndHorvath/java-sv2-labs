package exceptionmulticatch.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    AnswerStat answerStat;
    BinaryStringConverter binaryStringConverter;
    Throwable exception;

    @BeforeEach
    void setUp() {
        binaryStringConverter = new BinaryStringConverter();
        answerStat = new AnswerStat(binaryStringConverter);
    }

    @Test
    void getBinaryStringConverterTest() {
        assertEquals(binaryStringConverter, answerStat.getBinaryStringConverter());
    }

    @Test
    void convertTest() {
        assertArrayEquals(new boolean[] { true, false, true }, answerStat.convert("101"));
    }

    @Test
    void convertTestNull() {
        exception = assertThrows(
            InvalidBinaryStringException.class, () -> answerStat.convert(null));
        assertEquals("Invalid binary string.", exception.getMessage());
        assertEquals(NullPointerException.class, exception.getCause().getClass());
    }

    @Test
    void convertTestEmpty() {
        exception = assertThrows(
            InvalidBinaryStringException.class, () -> answerStat.convert(""));
        assertEquals("Invalid binary string.", exception.getMessage());
        assertEquals(IllegalArgumentException.class, exception.getCause().getClass());
    }

    @Test
    void convertTestInvalid() {
        exception = assertThrows(
            InvalidBinaryStringException.class, () -> answerStat.convert("1b1"));
        assertEquals("Invalid binary string.", exception.getMessage());
        assertEquals(IllegalArgumentException.class, exception.getCause().getClass());
    }

    @Test
    void answerTruePercentTest() {
        assertEquals(67, answerStat.answerTruePercent("101"));
    }
}