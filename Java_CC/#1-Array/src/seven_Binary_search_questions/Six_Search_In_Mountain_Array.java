package seven_Binary_search_questions;

import java.util.Arrays;

public class Six_Search_In_Mountain_Array {

    public static void main(String[] args) {
        int[] arr = {8, 12, 13, 15, 17, 7, 5, 4, 3, 1};

        System.out.println(search(arr, 17));

    }


    public static int search(int[] arr, int target) {
        int peak = peakOfMountain(arr);
        int partOne = binarySearch(arr, target, 0, peak);

        if (partOne != -1) {
            return partOne;
        }

        return binarySearch(arr, target, peak + 1, arr.length - 1);

    }


    public static int peakOfMountain(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }

        }
        return -1;
    }


    // Return Index
    public static int binarySearch(int[] arr, int targetElement, int start, int end) {
        // Array should be sorted otherwise use Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //  Number of elements in array =  2^ Maximum comparisons with binary search

        for (int i = 0; i < Math.log10(arr.length) / Math.log10(2); i++) {
            System.out.println("(Start + end) / 2  = " + (start + end) / 2);
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
        return -1;

    }


}
