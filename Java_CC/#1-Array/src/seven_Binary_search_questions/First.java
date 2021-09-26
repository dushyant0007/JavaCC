package seven_Binary_search_questions;

public class First {
    public static void main(String[] args) {

        // Floor value = the greatest number smaller or equal to target

        // Ceiling of a number = find the smallest number in the array which
        //    is greater than or equal to the target number

        int [ ] arr ={4,7,9,12,13,15,24,28,30,36,42,48,52,57,59,61};
        int target = 0;
    }



// for floor value replace return arr[start] ; to return end [ end ] ;
    static int binarySearchCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
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
        return arr[start];
    }




}
