package threeMaxMinProblems;

public class Main {
    public static void main(String[] args) {
        int[] arr = {94, 23, 85, 1, 53, 14, 42, 65};
        //  System.out.println(minValue(arr));
        //  System.out.println(maxValue(arr));

        int[][] twoD = {
                {4, 2, 6, 1},
                {12, 8, 3, 61},
                {12, 9},
                {15, 22, 41, 11}
        };
        System.out.println(towDSearch(twoD, 13));

    }

    // Minimum value in an array
    public static int minValue(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int j : arr) {
            if (minValue > j) {
                minValue = j;
            }
        }
        return minValue;

    }

    // Maximum value in an array
    public static int maxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
//        for (int i = 0 ; i < arr.length ; i ++){
//            if (maxValue<arr[i]){maxValue = arr[i];}
        //      }
        // enhanced for loop
        for (int j : arr) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    // 2d array search
    public static boolean towDSearch(int[][] twoD, int target) {

//        for (int row = 0 ; row < twoD.length; row ++) {
//            for (int col = 0; col < twoD[row].length; col++){
//                if( twoD[row][col] ==target)   {return  true;}
//            }
//        }
        for (int[] ints : twoD) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }

// Max in 2 d array

    public static int towDMax(int[][] twoD) {
           int twoDMax = Integer.MIN_VALUE;

//        for (int row = 0 ; row < twoD.length; row ++) {
//            for (int col = 0; col < twoD[row].length; col++){
//                if( twoD[row][col] > twoDMax)   {twoDMax =twoD[row][col]; }
//            }
//        }

        for (int[] ints : twoD) {
            for (int anInt : ints) {
                if (anInt > twoDMax) {
                    twoDMax = anInt;
                }
            }
        }
       return twoDMax;


    }




}