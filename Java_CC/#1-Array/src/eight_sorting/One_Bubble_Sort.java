package eight_sorting;

import java.util.Arrays;

public class One_Bubble_Sort {

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4, 2};
        int [] b = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort(b)));

    }

    private static int[] sort(int[] arr) {
        int x = 0;
        boolean swapped;
        while (x < arr.length) {
            swapped = false;
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){break;}
            x++;
        }
        return arr;
    }

    // classroom code
    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i ; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }

}
