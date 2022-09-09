package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromePropertyTest
{

    Palindrome palindrome;
    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    /**
     * Property Test
     */
    @Property
    @DisplayName("Palindrome variable 'madam' should return true.")
    public void palindromeOutPutIsABoolean(@ForAll String aString)
    {
        assertTrue(Palindrome.isPalindrome("madam"));
    }
}
