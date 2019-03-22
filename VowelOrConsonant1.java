package ClassExercises;

import java.util.Scanner;

public class VowelOrConsonant1 {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a character: ");
            String input = keyboard.nextLine();
            char letter = input.charAt(0);
            switch (letter) {
                case 'a' :
                case 'A' :
                    System.out.println("This is a vowel");
                    break;
                case 'e' :
                case 'E' :
                    System.out.println("This is a vowel");
                    break;
                case 'i' :
                case 'I' :
                    System.out.println("This is a vowel");
                    break;
                case 'o' :
                case 'O' :
                    System.out.println("This is a vowel");
                    break;
                case 'u' :
                case 'U' :
                    System.out.println("This is a vowel");
                    break;
                    //you could add case 'B' - 'Z' and have default
                    //returning as 'invalid input'
                default :
                    System.out.println("This is a consonant.");
            }
        }
    }