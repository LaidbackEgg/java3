package ClassPracticals;

import java.io.*;

class Practical1b {

    public static void main (String [] args) throws IOException {
        int p = 7;
        int q = -4;
        int r = (p*3)+(4*q);
        int s = (p*5)+((r*6));
        int t = 7;

        // if-else construct
        if (r>s) {
            t=(p+r+s);
        }

        else; {
            t=(p+q+s);
        }

        System.out.print("p = " + p);
        System.out.print("\nq = " + q);
        System.out.print("\nr = " + r);
        System.out.print("\ns = " + s);
        System.out.print("\nt = " + t);
    } // main
} // class