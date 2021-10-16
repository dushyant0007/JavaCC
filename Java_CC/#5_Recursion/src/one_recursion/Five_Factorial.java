package one_recursion;

public class Five_Factorial {

    public static void main(String[] args) {
        System.out.println(factorials(5));
    }

public static int factorials(int n){

    if (n ==1 || n==0){
        return 1 ;}

    return n* factorials(n-1);



}

}
