package exceptionresource.hiddenword;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord;
    Path path;
    Throwable exception;

    @BeforeEach
    void setUp() {
        hiddenWord = new HiddenWord();
        path = Path.of("src/test/resources/hiddenword.txt");
    }

    @Test
    void getHiddenWordTest() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(path));
    }

    @Test
    void getHiddenWordTestInvalid() {
        path = Path.of("src/test/resources/hiddenword_.txt");
        exception = assertThrows(
            IllegalStateException.class, () -> hiddenWord.getHiddenWord(path));
        assertEquals("Cannot read file.", exception.getMessage());
        assertTrue(exception.getCause() instanceof IOException);
    }
}