package one_String;

import java.util.ArrayList;

public class Five_Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println('a' + 2);
        System.out.println((char) ('a' + 3));
        System.out.println((int) 'd');
        System.out.println("a" + 1); // integer will be converted to (next step) Integer that will call toString

        // String ans = " --> "+ new Integer(56) + new ArrayList<>();
        // System.out.println(ans);

    }

}
