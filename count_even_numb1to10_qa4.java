public class count_even_numb1to10_qa4 {

    public static void main(String[] args) {
        int evennum=0;
        for(int i=1; i<=10; i=i+1){

            if(i%2==0){
                evennum= evennum+1;
            }
        }
        System.out.println("Even Number Count: "+ evennum);
    }
}
