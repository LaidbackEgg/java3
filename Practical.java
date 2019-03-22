package ClassPracticals4;

import java.util.*;

        public class Practical {

            public static void main(String[] args) {

                LinkedList<Integer> listNum = new LinkedList<>();
                listNum.add(2);
                listNum.add(4);
                listNum.add(8);
                listNum.add(6);
                listNum.add(1);
                listNum.add(99);
                listNum.add(18);
                listNum.add(21);
                listNum.add(23);
                listNum.add(85);
                listNum.add(3);
                listNum.add(5);
                listNum.add(10);
                listNum.add(61);
                listNum.add(23);
                listNum.add(12);
                listNum.add(14);
                listNum.add(81);
                listNum.add(60);
                listNum.add(29);
                System.out.println(listNum + " - original 'listNum' list");

                listNum.add(0, 16);
                listNum.add(21, 24);
                System.out.println(listNum + " - new 'listNum' list");

                int firstIndexA = listNum.indexOf(6);
                int lastIndexA = listNum.lastIndexOf(6);
                if (listNum.contains(6)) {
                    System.out.println("Found the element 6 at first location: " + firstIndexA + " and last location: " + lastIndexA);
                }
                else {
                    System.out.println("Element 6 does not exist.");
                }

                int firstIndexB = listNum.indexOf(15);
                int lastIndexB = listNum.lastIndexOf(15);
                if (listNum.contains(15)) {
                    System.out.println("Found the element 15 at first location: " + firstIndexB + " and last location: " + lastIndexB);
                }
                else {
                    System.out.println("Element 15 does not exist.\n");
                }

                for (int i = 0; i < listNum.size(); i++) {
                    System.out.println(listNum.get(i) + " is in position " + i);
                }//for;

                System.out.println("\n"+ listNum + " - original");
                listNum.removeFirst();
                System.out.println(listNum + " - first deleted");
                listNum.removeLast();
                System.out.println(listNum + " - last deleted");
                listNum.remove(3);
                System.out.println(listNum + " - slot 4 deleted\n");

                System.out.println(listNum + " - original");
                Collections.swap(listNum,3,16);
                System.out.println(listNum + " - 3 and 16 swapped");

                LinkedList<Integer> listNum2 = new LinkedList<>();
                listNum2.add(100);
                listNum2.add(101);
                listNum2.add(102);
                listNum2.add(103);
                listNum2.add(104);
                listNum2.add(105);
                System.out.println("\nnew list: " + listNum2);
                listNum.addAll(listNum2);
                System.out.println("updated list: " + listNum);

                System.out.println("");
                listNum.removeAll(listNum2);
//                System.out.println(listNum + " - updated list");
                removeElement(listNum2);
                listNum.addAll(listNum2);
                System.out.println(listNum + " list without first element as per method");

                System.out.println();
                int search32 = listNum2.indexOf(32);
                if (listNum2.contains(32)) {
                    System.out.println("Found the element 32 at first location: " + search32);
                }
                else {
                    System.out.println("Element 32 does not exist.");
                }

                System.out.println();
                ListIterator<Integer> iterator = listNum2.listIterator();
                if (iterator.hasNext()) {
                System.out.println("Elements exist in list");
                }
                else {
                    System.out.println("List is empty");
                }

            }

    public static int removeElement(LinkedList<Integer> listNum2) {
        int firstElement = listNum2.removeFirst();
        return firstElement;
    }

}
