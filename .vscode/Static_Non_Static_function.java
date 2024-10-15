

public class Static_Non_Static_function {

    void sup1(){
        System.out.println("Sp1 is a methond");
        sup2();

    }

    void sup2(){

        System.out.println("Im Sp2");
    }

    static void sup3(){
        System.out.println("Im Sp3 Ststic function"); 
    }
   
    public static void main(String[] args) {
        Static_Non_Static_function fun = new Static_Non_Static_function();
        fun.sup1();
        sup3();
    }
    
}
