package oneArr;

import java.util.Arrays;
import java.util.Scanner;

public class One_ArrayBasic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


//       // Syntax of array --> dataType [ ]  ArrayNamed = new dataType [Size]

//  //      Storing 5 roll numbers
        int [] rollNum = new int[5]; // --- or---   int [] = {1,34,24,16,76};
      //  // Now There is 5 int memory blocks are reserved to this array
        // //   The indexing of the array blocks is start form 0 to 4 (total 5 blocks)
//
//        System.out.println("Input of rollNum array");
//     for(int i = 0 ; i < rollNum.length;i++){
//         rollNum[i] = in.nextInt();
//     }
//
//        System.out.println("Output  of rollNum array");
//        //   for each loop
//        for (int j : rollNum) {
//            System.out.println(j+ " ");
//        }






         //    // 2d arrays
        //             //          |---> no. or rows
        int [][] d = new int[3][3];
//                                       |------> no. of columns

//    //    input//-->

        System.out.println(" Input of 2d name d array");
for (int row = 0 ; row < d.length ; row++){

    for (int col = 0 ; col < d[row].length ; col++){
        d[row][col] = in.nextInt();
    }
}
// // output---> ( more traditional method )
//for (int row = 0 ; row < 3; row ++){
//
//    for(int col = 0 ; col < 3 ; col ++){
//        System.out.print(d[row][col] + "  ");
//    }
//    System.out.println();
//}
//    //  smart output
//        for (int row = 0 ; row < 3; row ++){
//            System.out.println(Arrays.toString(d[row]));
//        }
        // very smart output
        for (int []  a : d){
            System.out.println(Arrays.toString(a));
        }
//        // very smart output understanding
//        for (int []  a : d){
//            for (int i = 0 ; i < a.length; i++){
//                System.out.print(a[i]);
//            }
//            System.out.println();
//        }







        // 2d arrays
        //                           |---> no. or rows
        int [][] b = new int[3][];
//                                       |------> no. of columns
                                           // column input in not Necessary
                                         //  Adjust according to input





        int [][] e = {
//              |----> 1 column
                {1, 2, 4} ,   // --> 1 row   // 0 index
                {3, 5, 2} , // 1 index
                {6, 9, 3}     // 2 index
                //    e [1] --output--> [2, 5, 2]
                //     e[2][1]---output--> [9]
        };





        int [][] f = {
//              |----> 1 column
                {8, 12, 41} ,   // --> 1 row   // 0 index
                {21, 13,} , // 1 index
                {6, 9, 3, 7}     // 2 index
        };


    }
}
