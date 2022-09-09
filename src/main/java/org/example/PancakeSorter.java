package org.example;

/**
 * PancakeSorter assignment.
 * min 1, max 25
 */
public class PancakeSorter {

    int[] unsortedPancakes = {10, 5, 24, 2, 36, 27};
    int[] unsortedPancakes2 = {10, 20, 30, 40, 50, 60};

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

    static void flip (int[] pancakes, int index)
    {

    }

    /**
     * Finds the index of the maximum value in the array searching till the searchCutoff.
     */
    static int findMax (int[] pancakes, int searchCutoff)
    {
        int indexCurrentMax = 0;
        for (int iterator = 0; iterator < searchCutoff; iterator++) {
            System.out.println( "FOR iterator= " + iterator);
//            System.out.println( "FOR iterator= " + iterator);
            if (pancakes[iterator] > pancakes[indexCurrentMax]) {
                indexCurrentMax = iterator;
            }
        }
        return indexCurrentMax;
    }
}
