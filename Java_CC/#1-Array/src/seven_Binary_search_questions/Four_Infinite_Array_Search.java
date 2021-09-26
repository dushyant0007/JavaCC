package seven_Binary_search_questions;

public class Four_Infinite_Array_Search {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 7, 8, 8, 8, 8, 8, 12, 16, 22, 28, 45,};
        System.out.println(ans(arr, 16));

    }


    public static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = end + (end - temp + 1) * 2;
        }

        return binarySearch(arr, target, start, end);

    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }


}

