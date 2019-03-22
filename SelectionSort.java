package ClassPracticals3;

import java.util.Arrays;

public class SelectionSort {

    public static void main (String [] args) {
        //int[] data = {9, 2, 3, 4, 5, 6, 1};
        //int[] data = {23, 54, 78, 12, 89, 56, 33};
        int[] data = {23, 54, 78, 12, 89, 56, 33};
        selectionSort(data);
    }

    public static void selectionSort(int data[]) {
        int in, out, min;
        int comparisons = 0, swaps = 0;
        int passes = 0;

        //System.out.println("Current order: " + Arrays.toString(data));

        for (out=0; out < data.length-1; out++) {
            min = out;
            passes++;
            System.out.println("Pass " + passes + ": " + Arrays.toString(data));
            for (in = out+1; in < data.length; in++) {
                comparisons++;
                if (data[in] < data[min]) {
                    min = in;            // new minimum
                    swaps++;
                }
            }
            int tmp = data[out];     // swap items
            data[out] = data[min];   //
            data[min] = tmp;		   //

            //System.out.println("Current order: " + Arrays.toString(data));
        }
        System.out.println("\nComparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
    }

}
