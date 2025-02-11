public class Star_reverse {

    public static void main(String[] args) {
        
        int n =100;

        int a =n;
        for (int i = 0; i <=n; i++) {

            for (int k = 0; k <i; k++) {
                System.out.print(" ");
            }
          
            for(int j=a; j>=1; j--){
                System.out.print("*");
            }
            a--;
            System.out.println("");
        }
    }
    
}
