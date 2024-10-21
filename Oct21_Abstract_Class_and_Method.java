//An abstract class is declared using the abstract keyword. It serves as a blueprint for other classes. 
//Here’s how you define an abstract class:
abstract class Vechical {
//An abstract method does not have a body. 
//It is declared in an abstract class, and subclasses must provide their own implementation for this method.
   abstract void speed();
    
}
class Car extends Vechical{

    @Override
    void speed() {
        System.out.println("45 kmps");
    }
}
class bike extends Vechical{
    void speed(){
        System.out.println("145 kmps");
     }
}
public class Oct21_Abstract_Class_and_Method {
    public static void main(String[] args) {
        Car c1= new Car();
        c1.speed();
        bike b1=new bike();
        b1.speed();
    }
}
