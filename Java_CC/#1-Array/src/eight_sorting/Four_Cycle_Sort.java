package eight_sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Four_Cycle_Sort {

    // When given numbers are from 1 to N, Use cycle sort

    public static void main(String[] args) {
        int [] arr = {5, 7, 4, 3, 6, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length -1 ) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] ) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}







