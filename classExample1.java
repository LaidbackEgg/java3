package RecurrsionExamples;

public class classExample1 {

    public static void main(String[] args) {
        emptyVase(5);
    }

    public static void emptyVase(int flowersInVase) {
        if (flowersInVase > 0) {
            System.out.println("Number of flowers in vase: " + flowersInVase);
            emptyVase(flowersInVase-1);
        }
        else {
            System.out.println("Vase is now empty");
        }
    }
}
