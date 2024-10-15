import java.util.Scanner;;
public class Operators_Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
 
        if (num1==num2){
         System.out.println("Both Numbers are Equal");
        }
        else {
         System.out.println("Both Numbers are Not Equal");
        }
    }
}
