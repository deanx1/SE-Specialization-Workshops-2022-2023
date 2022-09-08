package org.example;

/**
 * Hello world!
 *
 */
public class Palindrome
{

    public static void main( String[] args )
    {
        String truePalindrome =  "madam";
        String falsePalindrome =  "adam";

        System.out.println( "Sentence " + truePalindrome + " is palindrome?: " + isPalinDrome(truePalindrome));
        System.out.println( "Sentence '" + falsePalindrome + "' is palindrome?: " + isPalinDrome(falsePalindrome));
//        System.out.println(truePalindrome.length());
//        System.out.println(truePalindrome.length()/2);
    }

    // TODO test if it works with even and uneven strings.
    public static Boolean isPalinDrome(String possiblePalindrome) {
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
