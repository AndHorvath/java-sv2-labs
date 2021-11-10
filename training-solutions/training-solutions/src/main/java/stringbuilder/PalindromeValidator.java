package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);

        return word.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}