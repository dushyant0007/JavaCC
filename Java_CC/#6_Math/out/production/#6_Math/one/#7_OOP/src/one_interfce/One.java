package one_interfce;

// Variables are static and final by default
// Interface don't have constructor this because you can't initialise variable so all variables are by default final and static
//  body  of static method should be defined in the interface class
//Interface only contain abstract function by default function are public
public interface One {

    static public int price = 12;

   abstract  int returnInt(int a);

   static void staticMethod(){
       System.out.println("This is a static method in the interface");
   }

}
