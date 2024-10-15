public class Laptop_Function {
    String name ;
    String proc;
    String Gen;
    int ram;
    int price;

    public static void main(String[] args) {
        
     Laptop_Function lap1= new Laptop_Function ();

     lap1.name="Lenovo";
     lap1.proc="i3";
     lap1.Gen="13Th";
     lap1.price=69489;
     System.out.println(lap1.proc);

     Laptop_Function lap2= new Laptop_Function ();

     lap2.name="HP";
     lap2.proc="i5";
     lap2.Gen="14Th";
     lap2.price=894810;
     System.out.println(lap2.name);

     Laptop_Function lap3 = new Laptop_Function();
     System.out.println(lap3.price);

    }
    
}
