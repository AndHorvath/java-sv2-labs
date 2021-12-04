package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;
    String palindromeWord;
    String notPalindromeWord;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
        palindromeWord = "redivider";
        notPalindromeWord = "rediclider";
    }

    @Test
    void isPalindromeTest() {
        assertTrue(palindrome.isPalindrome(palindromeWord));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertFalse(palindrome.isPalindrome(notPalindromeWord));
    }
}