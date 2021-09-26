package eight_sorting;

import java.util.Arrays;

public class Two_Selection_Sort {
    public static void main(String[] args) {

        int[] arr = {4, 7, 9, 2, 6, 4, 1, 5, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Method one //
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int a = max(arr, 0, arr.length - 1 - i);
            int end = arr.length - 1 - i;

            int temp = arr[a];
            arr[a] = arr[end];
            arr[end] = temp;

        }


    }

    // return max index
    public static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {

            if (arr[max] < arr[i]) {
                max = i;
            }
            //System.out.println(max);
        }
        return max;
    }


    // Method  two
    public static void selectionSort(int[] arr) {

        for (int i = 0; i <arr.length -1 ; i++) {
            int min = i ;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }



}
