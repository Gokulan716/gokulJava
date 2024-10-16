import java.util.Scanner;;
public class numbers_add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        /* int rem1 = num%10;
        num= num/10;
        int rem2= num%10;
        num= num/10;
        int rem3= num%10; */
        int rem;
        int sum=0;

    /*   do{
           rem= num%10;
           num=num/10;
           sum= sum+rem;
        } while(num!=0);
         System.out.println(sum);
*/  
        

   /*    for(;num!=0; num=num/10){
            sum+=num%10;
        }
         int sum1=0;
        if (sum>=10){
            for( ;sum!=0; sum=sum/10){
                sum1+=sum%10;
            }
            System.out.println(sum1);
        }*/  

        while (num >= 10) {
            int num2 = 0;
            while (num != 0) {
                num2 += num % 10;  
                num = num / 10;      
            }
            num = num2;  
        }
        System.out.println(num);

    
    }
    
}
