package seven_Binary_search_questions;

public class Five_Find_peak_In_Mountain_Array {

    // Mountain array example ---> first increasing then reach to max then decreasing
    // In this problem we have to find the peak of mountain;

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8, 12, 17, 15, 13, 8, 6, 3};
        int [] b = {4,5,6,7,3,2,1,0}; //
        System.out.println(peakOfMountain(arr));

    }

    public static int peakOfMountain(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }

        }
        return -1;
    }


}
