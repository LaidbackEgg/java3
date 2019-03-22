package ClassPracticals3;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String[] args) {
        //int[] data = {9, 2, 3, 4, 5, 6, 1};
        //int[] data = {23, 54, 78, 12, 89, 56, 33};
        int[] data = {23, 54, 78, 12, 89, 56, 33};
        bubbleSort(data);
    }

    public static void bubbleSort(int[] data) { // OR ...( Comparable[] data ) {

        int swaps = 0;
        int comparisons = 0;
        int passes = 0;

        //System.out.println("Current order: " + Arrays.toString(data));

        for (int out = data.length-1; out > 0; out--) {
            passes++; //number of passes
            System.out.println("Pass " + passes + ": " + Arrays.toString(data));

            for (int in = 0; in < out; in++) {
                comparisons++; //number of comparisons
                if (data[in] > data[in+1]) { // OR data[in].compareTo(data[in+1]) > 0 {
                    swaps++; //number of swaps
                    int tmp = data[in];		// swap items
                    data[in] = data[in+1];	//
                    data[in+1] = tmp;		//
                    //System.out.println("Current order: " + Arrays.toString(data));
                }
            }
        }
        System.out.println("\nComparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
                //System.out.println("Passes = " + passes);
    }

}
