//This is Hierarchical.  (Father, Son & Daughter)

 class  Vechical {
     void Horn(){
        System.out.println("Boom Boom");
     }
}
class  Car extends Vechical{
    void Humans (){
       System.out.println("Humans can travel on me");
    }
}
class  Truck extends Vechical{
    void Goods(){
    System.out.println("For shipping Goods");}
}

public class OCT_20_Hierarchical_Inheritance {
     public static void main(String[] args) {
        Car c1= new Car();
        Truck t1= new Truck();
        c1.Horn();
        c1.Humans();
        t1.Horn();
        t1.Goods();
     }
}
