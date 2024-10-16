public class Return_oct16{

    void soap( int money){
        
        System.out.println("Your soap");

    }

    int Chocolate(int money){
        int Chocolate_price =5;
        int rem = money-Chocolate_price;
        return rem;
    }

    int add(int a, int b){
        int sum= a+b;
        return sum;
    }
    String get_name (){
        return "Gokul";
    }
long get_phone_num(){
        return 9578371146L;
    }

    public static void main(String []args){
       Return_oct16 ar = new Return_oct16();
       ar.soap(20);
       int rem = ar.Chocolate(20);
       System.out.println(rem);
       int sum = ar.add(123, 109);
       System.out.println(sum);
       String name= ar.get_name();
       long mobile_num =ar.get_phone_num();
       System.out.println(name);
       System.out.println(mobile_num);
    }
}