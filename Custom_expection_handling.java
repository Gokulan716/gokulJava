import java.util.Scanner;
class AgeCriteria extends  Exception{

    public AgeCriteria(String s) {
        super(s);
    }

}

public class Custom_expection_handling {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        
        try {
            System.out.println("Enter Your age: ");
            int age = sc.nextInt();
     
            if (age<18){
                throw new AgeCriteria("Your Age should be above 18");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }



    }
    
}
