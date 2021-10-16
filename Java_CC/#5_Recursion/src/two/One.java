package two;

public class One {

    public static void main(String[] args) {

        printBoth(10);

    }

    private static void printBoth(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printBoth(n - 1);
        System.out.print(n + " ");

    }

    // 5 4 3 2 1
    public static void printFunctionRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        printFunctionRev(n - 1);
    }


    // 1 2 3 4 5
    public static void printFunction(int n) {
        if (n == 0) {
            return;
        }
        printFunction(n - 1);
        System.out.println(n + " ");
    }


}
