import java.util.Scanner;
public class Nov16_finally_keyword {
    public static void main(String args []){
       int err =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number to start");
       int a = sc.nextInt();
       try{
        err =0;
        int b= 10/a;
       }
       catch(Exception e){
        err=1;
         System.err.println(e);
       }
       finally{
        // finally block will execute in both the cases.
        if (err==0){
            System.err.println("No error found");
        }
        else{
            System.out.println("Error found while executing");
        }
       }
    }
}
