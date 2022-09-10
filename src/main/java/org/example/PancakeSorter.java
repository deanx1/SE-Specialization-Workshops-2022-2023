package org.example;

/**
 * PancakeSorter assignment.
 * min 1, max 25
 */
public class PancakeSorter {

    int[] unsortedPancakes = {10, 5, 24, 2, 36, 27};
    int[] unsortedPancakes2 = {10, 20, 30, 40, 50, 60};
    int[] unsortedPancakes3 = {60, 50, 40, 30, 20, 10};

    public static void main( String[] args )
    {
        PancakeSorter pancakeSorter = new PancakeSorter();

        int cutOff = 2;
        System.out.println( "Findmax searchCutoff= " + cutOff);
        int findMaxIndex = pancakeSorter.findMax(pancakeSorter.unsortedPancakes2, cutOff);
        System.out.println( "Findmax index result= " + pancakeSorter.unsortedPancakes2[findMaxIndex]);

    }

    static int[] sortPancakes(int[] unsortedPancakes)
    {
        return unsortedPancakes;
    }

    /**
     * Flips (reverses) the pancake array at the specified index.
     */
    static void flip (int[] pancakes, int cutOffIndex)
    {
        int start = 0;
        int temp;

        while (start < cutOffIndex){
            temp = pancakes[start];
            pancakes[start] = pancakes[cutOffIndex];
            pancakes[cutOffIndex] = temp;
            start++;
            cutOffIndex--;
        }

    }

    /**
     * Finds the index of the maximum value in the array searching till the searchCutoff.
     */
    static int findMax (int[] pancakes, int searchCutoff)
    {
        int indexCurrentMax = 0;
        for (int iterator = 0; iterator < searchCutoff; iterator++) {
            if (pancakes[iterator] > pancakes[indexCurrentMax]) {
                indexCurrentMax = iterator;
            }
        }
        return indexCurrentMax;
    }

    static void sortPancakes (int[] pancakes, int loopCutoff)
    {
        // Start at the end of the array and work yourself backwards to the beginning.
        for (int currentCutoff = loopCutoff; currentCutoff > 1; --currentCutoff) {

            // Find the index with the maximum value within our current array section
            int maxIndex = findMax(pancakes, currentCutoff);

            // Move the biggest pancake to the end of the current array section.
            if (maxIndex != currentCutoff-1)
            {
                // Flip the max index to the beginning of the array. So we can later flip it to the end
                flip(pancakes, maxIndex);

                // Move the max index to the end
                flip(pancakes, currentCutoff-1);
            }
        }
    }
}
