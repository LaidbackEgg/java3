package RecurrsionExamples;

public class classExample2 {

    public static void main(String[] args) {
        printNumbers1(5);
    }

    public static void printNumbers1(int writeNumbers) {
        if (writeNumbers > 0) {
            System.out.println("Number: " + writeNumbers);
            printNumbers1(writeNumbers-1);
        }
        else {
            System.out.println("No numbers left");
        }
    }
}
