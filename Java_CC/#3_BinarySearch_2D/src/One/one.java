package One;

import java.util.Arrays;

public class one {

    public static void main(String[] args) {

        int[][] m = {

                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 39},
                {33, 34, 38, 50}

        };
        int [][] k = {
                {0,1,2,3,},
                {4,5,6,7},
                {8,9,10,11}
        };

        System.out.println(Arrays.toString(search(m,38)));
        System.out.println(Arrays.toString(search(k,1 )));


    }

    public static int[] search(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[r].length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else c--;

        }

        return new int[]{-1,-1};
    }

}
