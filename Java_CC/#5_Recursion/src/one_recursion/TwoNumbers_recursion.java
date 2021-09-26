package one_recursion;

public class TwoNumbers_recursion {

    public static void main(String[] args) {

    }


    public static void print1(int n) {

        if (n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print1(n + 1);

    }


}