package nine_LinkedList;

public class OneIntro_Customer {

    private String name ;
    private double balance;


    public OneIntro_Customer(String name , int balance){
        this.name = name ;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
