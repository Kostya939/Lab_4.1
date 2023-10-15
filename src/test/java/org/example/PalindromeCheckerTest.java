package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("A Santa lived as a devil at NASA"));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("notapalindrome"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}

