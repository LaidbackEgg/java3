package ClassPracticals4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsFun {

    public static void main(String[] args) {

        System.out.println("TASK 1\n");
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(2);
        numList.add(4);
        numList.add(8);
        numList.add(16);
        numList.add(32);
        numList.add(64);

        System.out.println(numList + " - original 'numList' list");

        numList.add(new Integer(128));

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        System.out.println(numbers + " - original 'numbers' list");

        numList.addAll(3,numbers);

        System.out.println(numList + " - both lists merged (from position 3)");

        System.out.println("Position 5 value: " + numList.get(5));

        numList.set(6, 23);
        System.out.println(numList + " - position 6 replaced with value 23");

        numList.remove(Integer.valueOf(16));
        System.out.println(numList + " - value 16 removed\n");

        //print each value on a new line
        Iterator<Integer> iterator = numList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nTASK 2\n");
        LinkedList<String> StrList = new LinkedList<>();
        StrList.add("Mary");
        StrList.add("John");
        StrList.add("Peter");
        StrList.add("Shane");
        StrList.add("Seamus");
        StrList.add("James");
        System.out.println(StrList + " - original 'StrList' list");

        List<String> subList = StrList.subList(1,5);
        System.out.println(subList + " - sub list");

        Collections.reverse(StrList);
        System.out.println(StrList + " - StrList reversed");

        Collections.sort(StrList);
        System.out.println(StrList + " - StrList sorted");

        LinkedList<String> CopyStrList = new LinkedList<>();
        CopyStrList.add("George");
        CopyStrList.add("Ash");
        CopyStrList.add("Jack");
        CopyStrList.add("Tam");
        CopyStrList.add("Tom");
        CopyStrList.add("Tim");

        System.out.println(CopyStrList + " - original CopyStrList");
        Collections.copy(CopyStrList, StrList);
        System.out.println(CopyStrList + " - new CopyStrList");

        Collections.shuffle(CopyStrList);
        System.out.println(CopyStrList + " - CopyStrList now shuffled");

        if (StrList.contains("Shane")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
