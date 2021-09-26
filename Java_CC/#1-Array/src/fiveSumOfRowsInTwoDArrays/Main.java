package fiveSumOfRowsInTwoDArrays;

public class Main {
    public static void main(String[] args) {

        int [][] arr = {
                {14,12,16,3},
                {13,24,35,8,7,4},
                {44,26,12,4,17}
        };


    }


    public static int maxSumOfRowElements(int [][] arr){
           int ans = Integer.MIN_VALUE;
        for (int row = 0 ; row < arr.length ; row++){
            int sum  = 0 ;
            for(int col = 0 ; col < arr[row].length; col++ ){
               sum += arr[row][col];
            }
            if (sum>ans){ans=sum;}
        }

 return ans;
    };



}
