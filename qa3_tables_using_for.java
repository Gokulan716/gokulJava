import java.util.Scanner;
public class qa3_tables_using_for {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of table you want to print");
        int t = sc.nextInt();
        for (int i=1; i<=10; i=i+1){
            System.out.println(i+"x"+t+"="+i*t);
        }
    }
}
