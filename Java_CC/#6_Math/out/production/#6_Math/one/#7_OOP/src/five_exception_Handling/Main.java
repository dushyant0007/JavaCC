package five_exception_Handling;

public class Main {

    // In java there is a class that handles all the errors and exceptions called  THROWABLE
    // - THROWABLE extends Object
    // EXCEPTIONS AND ERRORS extends  THROWABLE
    // CHECKED and NOTCHECKED extends EXCEPTIONS
    // CHECKED exceptions occurs on compile time and NOTCHECKED on run time

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("No matter what happens this will always execute");
        }

    }

    static int divide (int a, int b){
        if (b==0){
            throw new ArithmeticException("Please Do Not divide by zero");
        }
        return a/b;
    }

}
