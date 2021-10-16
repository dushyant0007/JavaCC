package one_recursion;

public class Seven_reverseNumber {


    static int sum = 0;
    public static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }


    public static int rev2(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digit - 1) + helper(n / 10, digit - 1));
    }


}
