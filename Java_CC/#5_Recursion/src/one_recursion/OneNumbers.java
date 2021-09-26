package one_recursion;

public class OneNumbers {

    public static void main(String[] args) {

        // Write a function that takes in a number and prints it .
        // Print first five numbers 1, 2, 3, 4, 5 ;

        print1(1);

    }


    public static void print1(int n) {
        System.out.println(n);
        print2(n + 1);
    }

    public static void print2(int n) {
        System.out.println(n);
        print3(n + 1);
    }

    public static void print3(int n) {
        System.out.println(n);
        print4(n + 1);
    }

    public static void print4(int n) {
        System.out.println(n);
        print5(n + 1);
    }

    public static void print5(int n) {
        System.out.println(n);
    }


}
