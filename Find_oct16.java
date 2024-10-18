import java.util.Scanner;;
public class Find_oct16 {

    void add_or_even(int num){
        if (num%2==0){
            System.out.println("Entered Number is Even number");
        }
        else{
            System.out.println("Entered Number is Odd number");
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Find_oct16 fn= new Find_oct16();
        fn.add_or_even(num);
    }
    
}
