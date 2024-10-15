import java.util.Scanner;

public class ManualTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Name:");
        String b = sc.nextLine();

        System.out.println("You entered number: " + a);
        System.out.println("You entered name: " + b);
        
        sc.close();
    }
    
}
