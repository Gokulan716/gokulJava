public class Reverse_number {
    

    public static void main(String[] args) {
        
        int num = 512;
             
        int temp=0;

        while (num != 0) {
            int a = num % 10;
            temp = temp * 10 + a;  
            num /= 10; 
        }
        
        System.out.print(temp);
        
    }
}
