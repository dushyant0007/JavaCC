package one_abstract_classes;

//Inheritance from the abstract class
// It is important to override all the abstract method from the parent class
// It is kind of obvious because we can't define the body of method in abstract class
public class Two extends One{

    public Two(String name) {
        super(name);
    }

    @Override
    void fevColor(String color) {
        System.out.println(color);
    }

    @Override
    void fevCar(String car) {
        System.out.println(car);
    }


}
