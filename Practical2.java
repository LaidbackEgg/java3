package ClassPracticals2;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Practical2 {//StockReport

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        // open files
        try {
            BufferedReader afile = new BufferedReader(new FileReader(
                    "stock.txt"));
            BufferedReader bfile = new BufferedReader(new FileReader(
                    "quantity.txt"));
            BufferedReader cfile = new BufferedReader(new FileReader(
                    "item.txt"));
            BufferedWriter dfile = new BufferedWriter(new FileWriter(
                    "stockvalue.txt"));
            PrintWriter pw = new PrintWriter(dfile);

            for (int i=1; i<=10; i++) {
                double itemQuantity = Double.parseDouble((String)bfile.readLine().trim());
                double itemCost = Double.parseDouble((String)cfile.readLine().trim());
                String stock = afile.readLine().trim();

                //print to file
                pw.println(String.valueOf("\n" + stock + " £" + (df.format(itemQuantity * itemCost))));
                //print test to screen
                System.out.print((String.valueOf(stock + " £" + (df.format(itemQuantity * itemCost)) + "\n")));
            }

            // close files
            dfile.close(); cfile.close(); bfile.close(); afile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
