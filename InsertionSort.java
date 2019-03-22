package ClassPracticals3;

public class InsertionSort {

    public static void main (String [] args) {
        int[] data = {23, 54, 78, 12, 89, 56, 33};
        insertionSort(data);
    }

    public static void insertionSort( int data[] ) {
        int in, out, temp;
        int swaps = 0, comparisons = 0;

        for (out=1; out < data.length; out++) {
            temp = data[out];

            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                comparisons++;
                data[in] = data[in-1];

            }
            data[in] = temp;
            swaps++;
        }
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
    }
}
