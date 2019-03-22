package ClassPracticals;

import java.io.*;

public class UnknownNumElements {

    public static void main(String[] args) throws IOException {

        int num, total=0;

            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
        while (c != null) { // while not end of file
            num = Integer.parseInt(c);
            System.out.println(num);
            total += num;
            c = br.readLine();
            }
            br.close();
            fr.close();

        System.out.println("Total is " + total);
    }
}