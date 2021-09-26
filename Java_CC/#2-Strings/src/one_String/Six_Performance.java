package one_String;

public class Six_Performance {

    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);
            System.out.print(ch);
            System.out.print(" ");
            series = series + ch;

        }

        System.out.println(series);

    }

}
