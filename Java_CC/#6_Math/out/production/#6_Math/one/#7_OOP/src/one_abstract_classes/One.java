package one_abstract_classes;
//YOU CAN'T MAKE OBJECT OF ABSTRACT CLASS
// If the class have one or more than one abstract method
//   Then the class should be decelerated as abstract
// And the body of the method can't be defined in the abstract class
public abstract class One {

    String name;

    //Constructor
    public One(String name) {
        this.name = name;
    }

    abstract void fevColor(String color);
    abstract void fevCar(String car);

    void getName(){
        System.out.println(this.name);
    }


}
