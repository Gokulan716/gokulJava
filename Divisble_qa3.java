import java.util.Scanner;
public class Divisble_qa3 {
    
   // logical operator

   // Greater than >
   // less than <
   //And &&
   // Or  ||
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num%3==0 && num%5==0) {
            System.out.println("Entered the number is divsible by 3 & 5");
        }
        else{
            System.out.println("Entered the number is not divsible by 3 & 5");
        }
    }
}
