package three_Simple_Array;

import java.util.ArrayList;

public class One {

    public static void main(String[] args) {

        int arr[] = {6, 12, 4, 16, 20, 4,7,13,22,4};
        System.out.println(isSorted(arr, 0));
        System.out.println(isElementInArray(arr, 12, 0));
        System.out.println(returnAllIndexOfTarget(arr,4,0,new ArrayList<>()));
    }

    //    ------------------------xxxxxxxxxxxxxxx------------------------xxxxxxxxxxxxxxx------------------------

    // Returning all the indexes where target is present
    public static ArrayList returnAllIndexOfTarget(int arr[], int target, int startIndex, ArrayList<Integer> list){

        if (startIndex == arr.length){
            return list;
        }
        if (arr[startIndex] == target){
            list.add(startIndex);
        }
        return returnAllIndexOfTarget(arr,target,startIndex + 1,list);

    }


//    ------------------------xxxxxxxxxxxxxxx------------------------xxxxxxxxxxxxxxx------------------------


    // if the array is sorted or not
    public static boolean isSorted(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }


    //    ------------------------xxxxxxxxxxxxxxx------------------------xxxxxxxxxxxxxxx------------------------


    // Searching in the array
    public static boolean isElementInArray(int arr[], int target, int startIndex) {

        if (startIndex == arr.length) {
            return false;
        }

        // no need for this now because, this functionality i added in the return statement
        //        if (arr[startIndex] == target ){
        //            return true;
        //    }

        return arr[startIndex] == target || isElementInArray(arr, target, startIndex + 1);


    }


    //    ------------------------xxxxxxxxxxxxxxx------------------------xxxxxxxxxxxxxxx------------------------


    // Searching in the array
    // return index
    public static int searchInArrayReturnIndex(int arr[], int target, int startIndex) {

        if (startIndex == arr.length) {
            return -1;
        }
        if (arr[startIndex] == target) {
            return startIndex;
        } else {
            return searchInArrayReturnIndex(arr, target, startIndex + 1);
        }


    }


    //    ------------------------xxxxxxxxxxxxxxx------------------------xxxxxxxxxxxxxxx------------------------


}
