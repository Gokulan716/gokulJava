import java.util.Scanner;
public class School_oct16 {
    String pass_or_fail(int mark){
       if (mark>=35){
        return "Pass";
       }
       else{
       return "Fail";}
    }
    public static void main(String []args){
     School_oct16 sh = new School_oct16();
     System.out.println("Enter Your Marks");
     Scanner sc = new Scanner(System.in);
     int marks = sc.nextInt();
     String result=sh.pass_or_fail(marks);
     System.out.println(result);
}
}
