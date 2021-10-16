package one_recursion;

public class Six_SumOfDigit {

    public static void main(String[] args) {

        System.out.println(multiplicationOfDigit(23));

    }


    public static int sumOfDigit(int n){

        if (n==0){
            return 0;
        }

        return (n%10) + sumOfDigit(n/10);

    }

    public static int multiplicationOfDigit(int n){

        if (n%10==n){
            return n;
        }

        return (n%10) * multiplicationOfDigit(n/10);

    }

}
