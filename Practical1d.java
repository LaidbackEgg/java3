package ClassPracticals;

import java.util.Scanner;

public class Practical1d {

    public static int sumRange(int s, int e) {
        int n = 0;
        if (s > e)
        {
            n = (s - e) + 1;
        }
        if (e > s)
        {
            n = (e - s) + 1;
        }
        return (n * (s + e)) / 2;
    }


    public static void main(String[] args) {
        char answer;

        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter first number: ");
            int a = keyboard.nextInt();
            System.out.print("Please enter second number: ");
            int b = keyboard.nextInt();
            System.out.println("Sum of range is " + sumRange(a, b));

            System.out.print("Would you like to do this again? ");
            String input = keyboard.next();
            answer = input.charAt(0);
        }while (answer != 'N' && answer != 'n');
    }

}
