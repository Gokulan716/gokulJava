import java.util.Scanner;
public class Scholorship_qa2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Income = sc.nextInt();

        if (Income>6999) {
          System.out.println("Your Eligible for scholarship");
        }
        else{
            System.out.println("Your Not Eligible for scholarship");
        }
    }
    
}