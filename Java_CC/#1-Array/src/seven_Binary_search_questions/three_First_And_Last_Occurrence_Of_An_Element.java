package seven_Binary_search_questions;

import java.util.Arrays;

public class three_First_And_Last_Occurrence_Of_An_Element {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6,7,7,8, 8, 8, 8, 8, 12, 16, 22, 28, 45,};
        System.out.println(arr.length);

    }

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] =FindingStartIndex(nums,target);
        result[1] =FindingEndIndex(nums,target);
         return result;
    }

    private int FindingEndIndex(int[] nums, int target) {
        int index = -1 ;
       int start = 0  ;
        int end = nums.length -1  ;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] >=target) end = mid -1 ;
            else start = mid + 1 ;    // Here we're breaking out the loop
             if (nums[mid] == target ) {  index  = mid ; }
        }
        return index ;
    }


    private int FindingStartIndex(int[] nums, int target) {

        int index = -1 ;
        int start = 0  ;
        int end = nums.length -1  ;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] <= target ) {start = mid +1 ;}
            else end = mid -1 ;
            if (nums[mid] == target) index = mid ;
        }
        return index ;

    }




}



