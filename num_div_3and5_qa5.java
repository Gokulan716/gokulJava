public class num_div_3and5_qa5 {

    public static void main(String[] args) {    
        for(int i=1; i<=100; i=i+1){
            if(i%3==0 && i%5==0){
                System.out.println("Number Div by both "+ i);
            }
        }
    }
    
}