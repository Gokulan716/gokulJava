import java.util.Scanner;;
public class qa6_do_while {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=0;
        do{
         System.out.println("Enter you age should be greater than 18");
         age= sc.nextInt();
        }while(age<18);
        System.out.println(age);
    }   
}
