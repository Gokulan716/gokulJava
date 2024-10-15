import java.util.Scanner;

public class QA4_Math_name {

    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the Name:");
    String n=sc.nextLine();
    System.out.println("Enter the Mark:");
    double a = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Enter the Department:");
    String d=sc.nextLine();

    double  b= a/10;
    System.out.println("My Name is "+ n);
    System.out.println("My score is "+b+"/10");
        System.out.println("My Deparment is "+d);
    }
    
}
