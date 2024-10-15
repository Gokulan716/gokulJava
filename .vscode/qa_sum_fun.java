

public class qa_sum_fun {
    
    void sum(int a, int b){
        
        System.out.println("Addtion of your value :" +(a+b));
        System.out.println("Subration of your value :"+(a-b));
        System.out.println("Multiplication of your value :"+(a*b));

    }

    public static void main(String [] args ){

        qa_sum_fun funq = new qa_sum_fun();
        funq.sum(110, 28);
    }
}
