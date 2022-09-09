package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

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
        for (int pancake: pancakeSorter.unsortedPancakes
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
        assertTrue( pancakeSorter.unsortedPancakes.length <= 25);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the pancake array is not empty.")
    public void PancakeSorterArrayNotEmpty()
    {
        assertTrue( pancakeSorter.unsortedPancakes.length > 0);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the findMax function is able to find the maximum value in the array.")
    public void FindMaxCorrectlyFound()
    {
        int[] pancakeStack = {10, 20, 30, 40, 50};
        assertEquals( pancakeSorter.findMax(pancakeStack, pancakeStack.length), 4);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the findMax function 'searchCutoff' parameter works.")
    public void FindMaxSearchCutOffWorks()
    {
        int[] pancakeStack = {10, 50, 20, 60, 30};
        assertEquals( pancakeSorter.findMax(pancakeStack, 4), 3);
    }
}
