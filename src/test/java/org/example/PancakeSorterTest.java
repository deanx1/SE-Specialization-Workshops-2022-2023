package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for the PancakeSorter assignment using Test Driven Development.
 */
public class PancakeSorterTest {

    PancakeSorter pancakeSorter;
    @Before
    public void setUp() {
        pancakeSorter = new PancakeSorter();
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that there are no negative numbers in the pancake array.")
    public void PancakeSorterOnlyPositiveNumbers()
    {
        boolean onlyPositiveFound = true;
        for (int pancake: pancakeSorter.unsortedPancakes1
             ) {
            if (pancake < 1) {
                onlyPositiveFound = false;
            }
        }
        assertTrue(onlyPositiveFound);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the pancake array length is 25 or less.")
    public void PancakeSorterArrayLength()
    {
        assertTrue( pancakeSorter.unsortedPancakes1.length <= 25);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the pancake array is not empty.")
    public void PancakeSorterArrayNotEmpty()
    {
        assertTrue( pancakeSorter.unsortedPancakes1.length > 0);
    }
}
