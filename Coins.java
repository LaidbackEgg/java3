package ClassPracticals;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        int value = keyboard.nextInt();
        switch (value) {
            case 1 :
                System.out.println("One penny");
                break;
            case 2 :
                System.out.println("Two pence");
                break;
            case 5 :
                System.out.println("Five pence");
                break;
            case 10 :
                System.out.println("Ten pence");
                break;
            case 20 :
                System.out.println("Twenty pence");
                break;
            case 50 :
                System.out.println("Fifty pence");
                break;
            case 100 :
                System.out.println("One pound");
                break;
            case 200 :
                System.out.println("Two pound");
                break;
            //you could add case 'B' - 'Z' and have default
            //returning as 'invalid input'
            default :
                System.out.println("Invalid coin value: " + value);
        }
    }
}