package org.example;

/**
 * PancakeSorter assignment.
 * min 1, max 25
 */
public class PancakeSorter {
    int[] unsortedPancakes1 = {10, 5, 24, 2, 36, 27};

    static int[] sortPancakes(int[] unsortedPancakes)
    {
        return unsortedPancakes;
    }

    static void flip (int[] pancakes, int index)
    {

    }

    /**
     * Finds the index of the maximum value in the array searching till the searchCutoff.
     */
    static int findMax (int[] pancakes, int searchCutoff)
    {
        int indexCurrentMax = 0;
        for (int iteration = 0; iteration < searchCutoff; ++iteration) {
            if (pancakes[iteration] > pancakes[indexCurrentMax]) {
                indexCurrentMax = pancakes[iteration];
            }
        }
        return indexCurrentMax;
    }
}
