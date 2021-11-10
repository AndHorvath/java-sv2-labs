package stringbuilder;

public class PalindromeValidatorMain {

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("madam"));
        System.out.println(palindromeValidator.isPalindrome("mister"));
    }
}