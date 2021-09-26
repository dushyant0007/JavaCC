package six_Binary_Search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {99,83,64,58,39,21,16,11,8,6,4,1};
        int [] arr = {4,6,10,12,13,17,22,25};
        System.out.println(arr.length);
        System.out.println(binarySearch(arr, 17));

    }

    // Return Index
    public static int binarySearch(int[] arr, int targetElement) {
   // Array should be sorted otherwise use Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //  Number of elements in array =  2^ Maximum comparisons with binary search
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < Math.log10(arr.length) / Math.log10(2); i++) {
            System.out.println("(Start + end) / 2  = "+ (start+end )/2);
            if (arr[(start + end) / 2] == targetElement) {
                System.out.println("program end");
                return (start + end) / 2;
            } else if (arr[(start + end) / 2] > targetElement) {
                if (arr[start] < arr[end]) {
                    int k = (start + end) / 2 - 1;
                    System.out.println(arr[((start + end) / 2) - 1] + " /  (start + end) / 2 -1  = " + k + " Now i is " + i);
                    end = (start + end) / 2 - 1;
                } else {
                    int k = (start + end) / 2 + 1;
                    System.out.println(arr[((start + end) / 2) + 1] + " /  (start + end) / 2 + 1  = " + k + " Now i is " + i);
                    start = (start + end) / 2 + 1;
                }
            } else if (arr[(start + end) / 2] < targetElement) {
                if (arr[start] < arr[end]) {
                    int k2 = (start + end) / 2 + 1;
                    System.out.println(arr[((start + end) / 2) + 1] + " /  (start + end) / 2 + 1  = " + k2 + " Now i is " + i);
                    start = (start + end) / 2 + 1;
                } else {
                    int k = (start + end) / 2 - 1;
                    System.out.println(arr[((start + end) / 2) - 1] + " /  (start + end) / 2 -1  = " + k + " Now i is " + i);
                    end = (start + end) / 2 - 1;
                }
            }

        }
        return   -1 ;

    }



}