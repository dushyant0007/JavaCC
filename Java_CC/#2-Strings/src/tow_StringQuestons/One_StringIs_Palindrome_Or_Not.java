package tow_StringQuestons;

public class One_StringIs_Palindrome_Or_Not {

    //   Reading string == reversed string // palindrome TRUE

    public static void main(String[] args) {

        String e = "abcdcba";
        String f = "abcdebc";

        System.out.println(palindrome(e));
        System.out.println("-----------------------------------");

        System.out.println(palindrome(f));
        System.out.println("-----------------------------------");

    }

    public static boolean palindrome(String temp) {

        int start = 0;
        int end = temp.length() - 1;
        while (start < end) {

            if (temp == null || temp.length() == 0) {
                System.out.println(" String is empty ");
                return false;
            }

            System.out.println("Char at start = " + temp.charAt(start));
            System.out.println(" Char at end = " + temp.charAt(end));

            System.out.println(" Start = " + start);
            System.out.println(" End = " + end);

            System.out.println(" --> Next Step ");

            if (temp.charAt(start) != temp.charAt(end)) {
                return false;
            }

            start = start + 1;
            end = end - 1;
        }

        return true;
    }


}
