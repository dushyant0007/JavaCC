package one_String;

public class Four_PrettyPrinting {

    public static void main(String[] args) {



//        here are many format specifiers we can use. Here are some common ones:
//
//                %c - Character
//                %d - Decimal number (base 10)
//                %e - Exponential floating-point number
//                %f - Floating-point number
//                %i - Integer (base 10)
//                %o - Octal number (base 8)
//                %s - String
//                %u - Unsigned decimal (integer) number
//                %x - Hexadecimal number (base 16)
//                %t - Date/time
//                %n - Newline


        float a = 123.83939f;
        System.out.printf(" Formatted Number is %.2f ", a); // also round off
        System.out.println();
        System.out.printf(" Formatted Number is %.3f ", a);
        System.out.println();
        System.out.printf(" My name is %s and i am %s ", "Dushyant" , "Cool");

    }

}
