import java.util.Scanner;
public class Nov13_Execption_handling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=0;
        int b=0;
        int c=0;

        try{
            System.out.println("Enter Numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=0;
            c=a/b;
        }
        catch(Exception e ){
            System.out.println("Expection we encounter please retry "+e);
        }

        if (c!=0) {
            System.out.println("POrogram End & OutPut is: "+c);
        }
    }
}
