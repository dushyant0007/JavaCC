package one_recursion;

public class Three_Fibo {

        public static void main(String[] args) {

            System.out.println(fibo(6));

        }

        public static int fibo(int n) {

            // Base condition
            if (n<2){return n;}

            return fibo(n - 1) + fibo(n - 2);

        }



    }

