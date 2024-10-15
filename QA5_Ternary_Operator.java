import java.util.Scanner;;
public class QA5_Ternary_Operator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number A");
        int a =  sc.nextInt();
        System.out.println("Enter a number B");
        int b =  sc.nextInt();

        String result = a>b?"A is greatest Number" :"B is greatest Number";

        System.out.println(result);

    }
    
}
