package nine_LinkedList;

import java.util.ArrayList;

public class One_Intro {

    public static void main(String[] args) {

        OneIntro_Customer customer = new OneIntro_Customer("Ram", 23);
        OneIntro_Customer anotherCustomer = customer;
        anotherCustomer.setBalance(100);
        System.out.println("Balance of customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(12);
        intList.add(16);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1, 9); // In this line, the number 9 in inserted on index 1
        //  This is going to move all the elements on one higher index to fit
        // This may take higher processing power, This because we need Linked List

        System.out.println(" ------------------- $ ------------------- $ -------------------");

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }

    }



}
