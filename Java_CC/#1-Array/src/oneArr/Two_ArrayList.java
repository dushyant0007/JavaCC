package oneArr;

import java.util.ArrayList;

public class Two_ArrayList {
    public static void main(String[] args) {


//  MAKING ARRAY -- ADJUST SIZE AUTOMATICALLY
// SYNTAX
        // ArrayList<Array dataType> arrayName = new ArrayList <also can write datatype hear but not mandatory > () ;

        ArrayList<Integer> list = new ArrayList <> () ;
        list.add(1); // automatic index is assignee // index zero
        list.add(11); // index 1
        list.add(111); // index 2
        list.add(222);
        // list.add (index , value)
        list.add(1 ,2);
       list.remove(0);

        System.out.println(list.get(/*index*/3));
        System.out.println(list);



    }
}
