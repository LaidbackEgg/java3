package ClassPracticals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintingKnownNumValues {

    public static void main (String [] args) throws IOException {

        FileWriter fw = new FileWriter("tester.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        for (int i=1; i <= 10; i++) {
            pw.println(i);
        }//for
        pw.close(); bw.close(); fw.close();
    }//end
}//class


