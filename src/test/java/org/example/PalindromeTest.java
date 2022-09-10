package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


/**
 * Unit tests for Palindrome exercise.
 */
public class PalindromeTest
{
    Palindrome palindrome;
    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Palindrome variable 'madam' should return true.")
     public void testPalindromeTrue()
    {
        assertTrue( Palindrome.isPalindrome("madam"));
    }

    @Test
    @DisplayName("Palindrome variable 'Adam' should return false.")
    public void testPalindromeFalse()
    {
        assertFalse( Palindrome.isPalindrome("Adam"));
    }
}
