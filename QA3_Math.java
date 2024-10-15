import java.util.Scanner;

class QA3_Math{
    
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number A:");
    int a = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Enter the Number B:");
    int b = sc.nextInt();
    sc.nextLine(); 

    System.out.println("Enter the Number C:");
    int c = sc.nextInt();
    sc.nextLine(); 

     int d= a*b*c;
     int e=a+b+c;

     int div= d/e;

    System.out.println("Your Out put: " + div);
    
}
    }