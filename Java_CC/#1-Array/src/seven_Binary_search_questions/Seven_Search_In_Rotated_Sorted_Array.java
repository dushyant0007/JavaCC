package seven_Binary_search_questions;

import java.util.Arrays;

public class Seven_Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        //   int [] arr  = {8,12,13,15,17,1,3,5,6,7};
       int []arr = {4,5,6,7,0,1,2};
        // System.out.println(search(arr,3));
        //      System.out.println(peakOfMountain(arr));
        System.out.println(search(arr, 2));
    }

    public static int search(int[] nums, int target) {
        int peak = peakOfMountain(nums);

        int partOne = binarySearch(nums, target, 0, peak);

        if (partOne != -1) {
            return partOne;
        }
        return binarySearch(nums, target, peak + 1, nums.length - 1);
    }


    public static int peakOfMountain(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1] && nums[mid + 1] > nums[0]) {
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            }

        }
        return -1;
    }


    public static int binarySearch(int[] nums, int targetElement, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > targetElement) {
                end = mid - 1;
            } else if (nums[mid] < targetElement) {
                start = mid + 1;
            } else if (nums[mid] == targetElement) {
                return mid;
            }
        }
        return -1;
    }

}
