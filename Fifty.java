package ClassPracticals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fifty {

    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);

        int nums;
        String fname;

        System.out.print("How many numbers would you like: ");
        nums = keyboard.nextInt();

        System.out.print("What would you like to name the file: ");
        fname = keyboard.next();
        writeToFile(nums, fname);

    }//end

    public static void writeToFile (int nums, String fname) {
        int total = 0;

        try {

            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i <= nums; i++) {
                pw.println(i);
            }//for

            pw.close();
            bw.close();
            fw.close();
        }
        catch  (IOException e) {
            System.out.println(e);
        }

    }

}//class

//original code
//public class Fifty {
//
//    public static void main (String [] args) {
//
//        try {
//
//            FileWriter fw = new FileWriter("fifty.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//
//            for (int i = 1; i <= 50; i++) {
//                pw.println(i);
//            }//for
//
//            pw.close();
//            bw.close();
//            fw.close();
//        }
//        catch  (IOException e) {
//            System.out.println(e);
//        }
//    }//end
//}//class
