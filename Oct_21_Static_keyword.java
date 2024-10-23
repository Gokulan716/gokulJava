/*
In Java, the static keyword is used to modify variables, methods, 
and blocks of code that belong to a class rather than an instance of the class. This means that:

Static variables: Shared among all instances of a class, and initialized only once when the class is loaded.
Static methods: Can be called without creating an instance of the class, and do not have access to instance variables or methods.
Static blocks: Executed only once when the class is loaded, and used for static initialization.
 */
public class Oct_21_Static_keyword {

    static int G= 10;
    static{
        System.out.println("Bllock execution");
    }
    int a=20;
    public static void main(String[] args) {
        Oct_21_Static_keyword ad= new Oct_21_Static_keyword();
        ad.a=40;
        ad.G=50;

        System.out.println(G); // with out a object we can call and it will take the last set value through out the class

        System.out.println(ad.a); // with out the instance vaiable we can't call it.
        
    }
}
