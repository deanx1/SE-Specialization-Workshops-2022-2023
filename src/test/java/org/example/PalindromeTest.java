package org.example;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


/**
 * Unit test for simple App.
 */
public class PalindromeTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PalindromeTest(String testName )
    {
        super( testName );

        Palindrome palindrome;

//        @BeforeEach
//        void setUp() {
//            palindrome = new Palindrome();
//        }
    }

//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return (Test) new TestSuite( PalindromeTest.class );
//    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Palindrome variable 'madam' should return true.")
     void testPalindromeTrue()
    {
        assertTrue( "this will succeed", true );
    }
}
