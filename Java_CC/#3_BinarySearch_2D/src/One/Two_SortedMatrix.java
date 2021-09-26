package One;

import java.util.Arrays;

public class Two_SortedMatrix {

    public static void main(String[] args) {

        int[][] m = {

                {1, 3, 5, 7, 9},
                {10, 20, 25, 29, 34},
                {38, 40, 44, 49, 53,54,55,56,57,58,59},
                {60, 61, 65, 68, 74},
                {78, 80, 85, 90, 92}

        };

        System.out.println(search(m, 57));

    }


    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1,};
    }
//    -----------------------==========----------------=========------------


    // Searching In the Required Row
    public static int[] search(int[][] matrix, int target) {

        int rStart = 0;
        int rEnd = matrix.length - 1;

        while (rStart <= rEnd) {

            int rMid = rStart + (rEnd - rStart) / 2;
            int cEnd = matrix[rMid].length - 1;

            if (target <= matrix[rMid][cEnd] && target >= matrix[rMid][0]) {

                System.out.println(Arrays.toString(binarySearch(matrix, rMid, 0, cEnd, target)));
                return binarySearch(matrix, rMid, 0, cEnd, target);
            } else if (target > matrix[rMid][cEnd]) {
                rStart = rMid + 1;
            } else if (target < matrix[rMid][cEnd]) {
                rEnd = rMid - 1;
            }

        }

        return new int[]{-1, -1};
    }


//    -----------------------===================-------------------==============--------


    // Second ---> CC Method

//    public static int[] search (int [][] matrix , int target) {
//
//        int r = matrix.length;
//        int c = matrix[0].length;
//        if (r == 1) {
//            binarySearch(matrix, 0, 0, c - 1, target);
//        }
//
//        int rStart = 0;
//        int rEnd = r - 1;
//        int cMid = (r - 1) / 2;
//
//        while (rStart < (rEnd - 1)) {
//            int mid = rStart + (rEnd - rStart) / 2;
//            if (matrix[mid][cMid] == target) {
//                return new int[]{mid, cMid};
//            }
//
//            if (matrix[mid][cMid] < target) {
//                rStart = mid;
//            } else rEnd = mid;
//
//        }
//        if (matrix[rStart][cMid] == target) {
//            return new int[]{rStart, cMid};
//        }
//        if (matrix[rStart + 1][cMid] == target) {
//            return new int[]{rStart + 1, cMid};
//        }
//
//        // search in 1st half
//        if (target <= matrix[rStart][cMid - 1]) {
//            return binarySearch(matrix, rStart, 0, cMid - 1, target);
//        }
//        // search in 2nd half
//        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][c - 1]) {
//            return binarySearch(matrix, rStart, cMid + 1, c - 1, target);
//        }
//        // search in 3rd half
//        if (target <= matrix[rStart + 1][cMid - 1]) {
//            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
//        } else {
//            return binarySearch(matrix, rStart + 1, cMid + 1, c - 1, target);
//        }
//
//    }


}
