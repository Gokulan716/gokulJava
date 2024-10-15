import java.util.Scanner;;
public class qa4_array_creation_byfor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int [] nums = new int [size];
        System.out.println("Enter the elements of array");

        for(int i=0; i<=size-1; i=i+1){
            nums [i]= sc.nextInt();
        }

        int mid = size/2;

        if (size % 2==0) {

            System.out.println("Middle numnbers are : "+nums[mid-1]+ " and "+nums[mid]);
            
        }
        else{
            System.out.println("Middle numnber is : "+nums[mid]);
        }

        
    }
    
}
