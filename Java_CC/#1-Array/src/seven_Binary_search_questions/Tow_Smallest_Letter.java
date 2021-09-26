package seven_Binary_search_questions;

public class Tow_Smallest_Letter {
    public static void main(String[] args) {

        char[] arr = {'b', 'e', 'f', 'h', 'l', 'o', 'p', 's', 'u', 'v', 'z' };

        System.out.println(smallestChar(arr, 'q'));


    }


    // return smallest character in the array which is larger than target
    public static char smallestChar(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                  start = mid + 1;
            }

        }
        return arr[start % arr.length];


    }


}



