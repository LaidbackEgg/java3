package ClassPracticals2;

import java.io.*;

public class Practical1 {

    public static void main(String [] args) {
        int [] data = {10,11,12,13,14,15};
        String [] fileName = {"AA","BB","CC","DD",};

        System.out.println(countTotalPositiveValue(fileName));
        writeToFile(data, fileName);

    }

    // return total value of numbers in specified file
    public static int countTotalPositiveValue(String[] fileName) {
        // open file

        //declare local variables to count positive integers
        int num, count = 0;

        try {
            FileReader fr = new FileReader("C:\\Users\\Paul\\Desktop\\University\\COM742\\src\\ClassPracticals2\\tester.txt");
            BufferedReader br = new BufferedReader(fr);

            // and to store number read from file
            String c = br.readLine();

            // loop until end of file
                while (c != null) { // while not end of file
                    num = Integer.parseInt(c);
                    if (num >0) {  //   if number read from file is positive add it to count
                        count += num;
                    }
                    c = br.readLine();
                } // end of loop

                    fr.close();  // close file
        }//try

        catch (IOException e) {
            e.printStackTrace();
        }

        return count; // return count

    }//for

// write array data elements to specified file
        public static void writeToFile (int[] data, String fileName){

        int total = 0;
        // open file
        try {

            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i <= data.length; i++) {   // loop through each array position
                pw.println(i);
            }//for

            //   write array value to file (separate each item written
            //   with either a space a tab or a new line)
            // end of loop

            pw.close();
            bw.close();
            fw.close();
        }
        catch  (IOException e) {
            System.out.println(e);
        }
//            // close file
        }

    public static void writeToFile (int[] data, String[] fileName){

        int total = 0;
        // open file
        try {

            FileWriter fw = new FileWriter("fileName");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i <= data.length; i++) {   // loop through each array position
                pw.println(i);
            }//for

            //   write array value to file (separate each item written
            //   with either a space a tab or a new line)
            // end of loop

            pw.close();
            bw.close();
            fw.close();
        }
        catch  (IOException e) {
            System.out.println(e);
        }

            // close file
    }


    } // end of class