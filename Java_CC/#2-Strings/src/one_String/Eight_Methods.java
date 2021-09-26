package one_String;

import java.util.Arrays;

public class Eight_Methods {

    public static void main(String[] args) {

        String name = "Dushyant Jakhar" ;

        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name); // the methods creating new object and making changes
                                // Original object never change, # Strings are in mutable in java

    }

}
