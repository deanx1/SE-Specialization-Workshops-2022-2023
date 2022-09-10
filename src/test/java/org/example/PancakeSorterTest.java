package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

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

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the pancake array should not change when flipped at zero")
    public void FlipAtIndexZero()
    {
        int[] pancakeStack = {50, 20, 30, 10, 60};
        int[] originalPancakeStack = pancakeStack.clone();

        pancakeSorter.flip(pancakeStack, 0);

//        System.out.println(Arrays.toString(originalPancakeStack));
//        System.out.println(Arrays.toString(pancakeStack));

        assertArrayEquals(originalPancakeStack, pancakeStack);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the pancake flip occurs at the right index and the result is a sorted array")
    public void FlipAtSecondToLastIndex()
    {
        int[] pancakeStack = {40, 30, 20, 10, 50};
        int[] pancakeStackSorted = {10, 20, 30, 40, 50};
        int[] originalPancakeStack = pancakeStack.clone();

        pancakeSorter.flip(pancakeStack, pancakeStack.length - 2);

//        System.out.println(Arrays.toString(originalPancakeStack));
//        System.out.println(Arrays.toString(pancakeStack));

        assertArrayEquals(pancakeStack, pancakeStackSorted);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that an already sorted pancakes array does not change when we try to sort it")
    public void SortAlreadySortedPancakes()
    {
        int[] alreadySortedPancakes = {10, 20, 30, 40, 50};
        int[] originalPancakeStack = alreadySortedPancakes.clone();

        pancakeSorter.sortPancakes(alreadySortedPancakes, alreadySortedPancakes.length);

//        System.out.println(Arrays.toString(originalPancakeStack));
//        System.out.println(Arrays.toString(alreadySortedPancakes));

        assertArrayEquals(originalPancakeStack, alreadySortedPancakes);
    }

    /**
     * Unit Test
     */
    @Test
    @DisplayName("Assert that the sort functionality works and an unsorted array get sorted correctly.")
    public void SortUnsortedPancakes()
    {
        int[] toBeSortedPancakes = {60, 20, 10, 40, 90};
        int[] correctlySortedPancakes = {10, 20, 40, 60, 90};

        pancakeSorter.sortPancakes(toBeSortedPancakes, toBeSortedPancakes.length);

        System.out.println(Arrays.toString(toBeSortedPancakes));
        System.out.println(Arrays.toString(correctlySortedPancakes));

        assertArrayEquals(toBeSortedPancakes, correctlySortedPancakes);
    }
}
