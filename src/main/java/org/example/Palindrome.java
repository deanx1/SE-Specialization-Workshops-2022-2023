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

        System.out.println( "Sentence " + truePalindrome + " is palindrome?: " + isPalindrome(truePalindrome));
        System.out.println( "Sentence '" + falsePalindrome + "' is palindrome?: " + isPalindrome(falsePalindrome));
//        System.out.println(truePalindrome.length());
//        System.out.println(truePalindrome.length()/2);
    }

    // TODO test if it works with even and uneven strings.
    public static Boolean isPalindrome(String possiblePalindrome)
    {
        int palLength = possiblePalindrome.length();
        System.out.println("possiblePalindrome: " + possiblePalindrome + " palLength: " + palLength + " iterating times: " + palLength/2);
        for (int counter = 0; counter < palLength/2; counter++) {
            System.out.println("comparing: " + possiblePalindrome.charAt(counter) + " and " +
                    possiblePalindrome.charAt(palLength - counter - 1));
            if (possiblePalindrome.charAt(counter) != possiblePalindrome.charAt(palLength - counter - 1)){
                return false;
            }
        }
        return true;
    }
}
