package ClassPracticals3;

import java.util.Arrays;

public class BubbleSort2 {

    public static void main (String[] args) {
        int[] data = {3,6,2,8,1,9,4};
        int[] data2 = {18, 67, 12, 34, 54, 98, 47};
        System.out.println("\nTASK 1");
        bubbleSort(data);
        System.out.println("\nTASK 2");
        bubbleSort2(data2);
    }

    public static void bubbleSort(int[] data) { // OR ...( Comparable[] data ) {

        int swaps = 0;
        int comparisons = 0;
        int passes = 0;

        for (int out = data.length-1; out > 0; out--) {
            passes++;
            System.out.println("Pass " + passes + ": " + Arrays.toString(data));

            for (int in = 0; in < out; in++) {
                comparisons++; //number of comparisons
                if (data[in] > data[in+1]) { // OR data[in].compareTo(data[in+1]) > 0 {
                    swaps++; //number of swaps
                    int tmp = data[in];		// swap items
                    data[in] = data[in+1];	//
                    data[in+1] = tmp;		//
                }
            }
        }
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
    }

    public static void bubbleSort2(int[] data2) { // OR ...( Comparable[] data ) {

        int swaps = 0;
        int comparisons = 0;
        int passes = 0;

        for (int out = data2.length-1; out > 0; out--) {
            passes++;
            System.out.println("Pass " + passes + ": " + Arrays.toString(data2));

            for (int in = 0; in < out; in++) {
                comparisons++; //number of comparisons
                if (data2[in] > data2[in+1]) { // OR data[in].compareTo(data[in+1]) > 0 {
                    swaps++; //number of swaps
                    int tmp = data2[in];		// swap items
                    data2[in] = data2[in+1];	//
                    data2[in+1] = tmp;		//
                }
            }
        }
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
    }

}
