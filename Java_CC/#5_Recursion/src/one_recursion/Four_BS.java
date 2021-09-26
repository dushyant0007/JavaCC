package one_recursion;

import java.util.Arrays;

public class Four_BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(arr, target, 0, arr.length - 1));

        int []ref = {4,5};

        change(ref);
        System.out.println(Arrays.toString(ref));

    }

    public static void change (int ref[]){

        ref[0] = 1;
        ref[1]= 2;

    }



    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }


}