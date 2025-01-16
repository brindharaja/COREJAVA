import PalindromeChecker.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TestPalindrome {
    @Test
    public void testAllCases() {
        assertTrue(Palindrome.isPalindrome("madam"));
        assertFalse(Palindrome.isPalindrome("Hello"));
        assertTrue(Palindrome.isPalindrome("MalayalaM"));
        assertFalse(Palindrome.isPalindrome("madaM"));
        assertFalse(Palindrome.isPalindrome("String"));
    }
}