//This is Multi level Inheritance (Grand father, Dad & son)
 class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Mammal extends Animal {
    void eat() {
        System.out.println("Mammal eats");
    }
}

 class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

 public class Oct20_MultilevelInheritance {
    public static void main(String[] args) {
     Dog dd= new Dog();
     dd.sound();
     dd.eat();
     dd.bark();
}
}
