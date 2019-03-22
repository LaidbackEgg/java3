package ClassExercises;

        import java.util.Scanner;

public class Numbers1 {

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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = keyboard.nextInt();
        System.out.println("Please enter second number: ");
        int b = keyboard.nextInt();
        System.out.println("Sum of range is " + sumRange(a,b));
    }

}
