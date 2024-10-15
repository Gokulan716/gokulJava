import java.util.Scanner;
public class Mark_QA1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mark = sc.nextInt();

        if (mark>=35){
         System.out.println("You Are Pass");
        }
        else {

            System.out.println("You Are Fail");
        }
    }
    
}
