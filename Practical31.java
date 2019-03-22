package ClassPracticals3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Practical31 {

    public static void main(String [] args) throws FileNotFoundException {

        int[] numbers = readArrayFromFile("FileA.txt");

//        File f = new File("FileA.txt");
//        Scanner b = new Scanner(f);
//        int[] arr = new int[b.nextInt()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = b.nextInt();
//        }
//        for (int o : arr) {
//            System.out.println(o);
//        }

        bubbleSort(numbers);
        //System.out.println(numbers);

    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void bubbleSort(int[] array) {

        int count = 4;
        int comparisons = 0;
        int swaps = 0;

        for (int out = count - 1; out > 0; out--) { // sorts first 4 only
            for (int in = 0; in < out; in++) {
                comparisons++;
                if (array[in] > array[in + 1]) {
                    swap(array, in, in + 1);
                    swaps++;
                }//if
            }//for
        }//for

        System.out.println(Arrays.toString(array));
        System.out.println("Comparisons: " + comparisons + " and Swaps: " + swaps);

    }

    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
        int[] array = new int[1];

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            //System.out.println(array.length);

            for (int i = 0; i < size; i++) {

                c = br.readLine();
                array[i] = Integer.parseInt(c);
                System.out.print(array[i] + ", ");
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.print(e);
        }
        return array;
    }

}
