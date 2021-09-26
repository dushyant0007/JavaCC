package one_String;

public class Two_Comparison {

    public static void main(String[] args) {

        String a = "raja";
        String b = "raja";
        // ==
        System.out.println("string == string");
        System.out.println( a==b ); // print --> true

        //How to create different object of same values
        String k = new String("raja");
        System.out.println("String New object to string");
        System.out.println(k ==a); // checking if pointing a same
        System.out.println(k.equals(a)); // one checking values
        System.out.println();
        System.out.println("k.charAt(0)");;
        System.out.println(k.charAt(0)); //

        int i = 5;
        int j = 5;
        System.out.println();
        System.out.println("int == int");
        System.out.println( i==j ); // print ---> true

        Integer gk = new Integer(5);
        System.out.println();
        System.out.println("int == new object");
        System.out.println(i==gk);



    }

}
