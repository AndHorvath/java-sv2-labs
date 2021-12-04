package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    Vowels vowels;
    String testWord;

    @BeforeEach
    void setUp() {
        vowels = new Vowels();
        testWord = "palindrome";
    }

    @Test
    void getNumberOfVowelsTest() {
        int expectedNumberOfVowels = 4;
        assertEquals(expectedNumberOfVowels, vowels.getNumberOfVowels(testWord));
        assertEquals(0, vowels.getNumberOfVowels(""));
    }
}