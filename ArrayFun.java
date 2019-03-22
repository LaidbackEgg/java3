package ClassExercises;

import java.util.Scanner;

public class ArrayFun {

    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        char setOfChars[] = new char[10];
//        for (char i=0; i<setOfChars.length; i++) {
//            System.out.print("Enter a character: ");
//            setOfChars = keyboard.nextLine();
//        }

        double setOfNumbers[] = new double[5];
        setOfNumbers[0]= 3.3;
        setOfNumbers[1]= 9.0;
        setOfNumbers[2]= 45.0;
        setOfNumbers[3]= 6.5;
        setOfNumbers[4]= 7.9;

        for (int i=0; i<setOfNumbers.length; i++) {
            System.out.print(setOfNumbers[i] + ", ");
        }//for

        double setOfNumbers2[] = new double[5];
        setOfNumbers[0]= 3.3;
        setOfNumbers[1]= 9.0;
        setOfNumbers[2]= 45.0;
        setOfNumbers[3]= 6.5;
        setOfNumbers[4]= 7.9;

        for (int i=0; i<setOfNumbers2.length; i++) {
            System.out.print(2*setOfNumbers[i] + ", ");
        }//for

        double setOfNumbers3[] = new double[5];
        setOfNumbers[0]= 3.3;
        setOfNumbers[1]= 9.0;
        setOfNumbers[2]= 45.0;
        setOfNumbers[3]= 6.5;
        setOfNumbers[4]= 7.9;

        for (int i=setOfNumbers3.length; i>0; i++) {
            System.out.print(setOfNumbers[i] + ", ");
        }//for

    }//main
}//class
