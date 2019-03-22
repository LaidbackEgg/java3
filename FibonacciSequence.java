package RecurrsionExamples;

public class FibonacciSequence {

    public static void main(String[] args) {

        //fibonacci formula one

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("N = " + n + ". Fibonacci = ");
        for (int i = 1; i <= n; ++i) {
            //System.out.println("fib(" + t1 + ") = fib(" + t1 + ") + fib(" + t1 + ") = " + t1 + " + " + t1 + " = " + t2);

            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        //fibonacci formula two

//        System.out.println();
//        int n2 = 10, a1 = 3, a2 = 2;
//        for (int ii = 1; ii<=n2; ii++) {
//
//            System.out.print(a1 + " + ");
//            int sum2 = a1+a2;
//            a1 = a2;
//            a2 = sum2;
//
//        }
    }
}}
