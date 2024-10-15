import java.util.Scanner;
public class ab_input_qa1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a= sc.nextInt();
        System.out.println("Enter number 2");
        int b= sc.nextInt();

        for(int i=a; i<=b; i=i+1){

          System.out.println(i);
        }
    }
    
}
