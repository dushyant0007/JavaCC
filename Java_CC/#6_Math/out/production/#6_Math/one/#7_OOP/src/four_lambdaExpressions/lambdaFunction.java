package four_lambdaExpressions;

import java.util.ArrayList;

// Lambda function is one line function
public class lambdaFunction {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        //ex of Lambda function
        arr.forEach((value/*value is argument of function*/) -> System.out.println(value));

    }

}
