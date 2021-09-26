package one_pattern;

public class One_Pattern {

    public static void main(String[] args) {

patternOne(10);

    }


    public static void patternOne(int forHowManyLines){

        for (int i = 1 ; i <= forHowManyLines ; i++){

            for (int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }









}
