package org.example;

/**
 * Palindrome checker exercise in preparation for PancakeSorter.
 *
 * User story: As a palindrome lover I would like to know if a word is a palindrome, so I can add them to my collection of
 * palindromes.
 *
 */
public class Palindrome
{

    public static void main( String[] args )
    {
        String truePalindrome =  "madam";
        String falsePalindrome =  "adam";
    }

    // TODO test if it works with even and uneven strings.
    public static Boolean isPalindrome(String possiblePalindrome)
    {
        int palLength = possiblePalindrome.length();
        for (int counter = 0; counter < palLength/2; counter++) {
            if (possiblePalindrome.charAt(counter) != possiblePalindrome.charAt(palLength - counter - 1)){
                return false;
            }
        }
        return true;
    }
}
