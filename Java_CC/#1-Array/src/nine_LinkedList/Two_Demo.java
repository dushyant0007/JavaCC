package nine_LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

import java.util.ListIterator;


public class Two_Demo {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");

        System.out.println(placeToVisit); // or
        printList(placeToVisit);

        placeToVisit.add(1, "Alice Spring ");

        System.out.println(placeToVisit); // or
        printList(placeToVisit);

        placeToVisit.remove(4);

        System.out.println(placeToVisit); // or
        printList(placeToVisit);


    }


    public static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator(); // Iterator over every value of linkedList items
        System.out.println(i);   // address of i

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println(" ---------------------- $ ----------------------- $ -------------------- ");
    }

}