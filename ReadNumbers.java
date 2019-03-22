package ClassPracticals;

import java.io.*;

public class ReadNumbers {

    public static void main(String[] args)  {

        String fname = "";

        readNumbers(fname);

    }//main

    public static void readNumbers(String fname) {
        int num, count = 0;

        try {
            FileReader fr = new FileReader("tester.txt");
            BufferedReader br = new BufferedReader(fr);
            int c = br.read();

            while (c != -1) { // while not end of file
//                System.out.println(br.read());
                count += br.read();
                c = br.read();
            }//while

            br.close();
            fr.close();

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//readNumbers()

}//class
