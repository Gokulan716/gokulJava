import java.util.Scanner;
public class qa1_array_input {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i=0; i<=4; i=i+1){

            System.out.println("Enter the mark of subject "+ (i+1));
            marks[i] =  sc.nextInt();
        }
        System.out.println("Output");

        for(int i=0; i<=4; i=i+1){
            System.out.println(marks[i]);

        }
    }
    
}
