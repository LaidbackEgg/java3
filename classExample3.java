package RecurrsionExamples;

import java.util.Scanner;

public class classExample3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a positive number to calculate its factorial: ");
        int number = keyboard.nextInt();
        if (number <= 0){
            System.out.println("Please reenter a positive number!");
        }
        else {
            factorial(number);
            //System.out.println("Finished"+answer);
        }

    }

    public static int factorial (int number) {
        int answer;
        if (number == 0) {
            answer = 1;
        }//if
        else {
            //System.out.println(number);
            answer = number * factorial(number -1);
            System.out.println(answer);

        }//else
        return answer;

    }
}
