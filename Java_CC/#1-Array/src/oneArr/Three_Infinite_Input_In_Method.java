package oneArr;

import java.util.Arrays;

public class Three_Infinite_Input_In_Method {

    public static void main(String[] args) {

        fun(1, 2, 3, 2);

    }

    //                              |--> we also can make String ...<name of string input array>
    //                      |---> Array name v of inputs , size depends on the number of inputs
    static void fun(int ... v ) {
        System.out.println(Arrays.toString(v));
    }


}
