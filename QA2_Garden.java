

public class QA2_Garden {

    int apple_price =20;
    int apple_count =5;

    void total_money(){
        System.out.println("Your total money :"+ apple_price*apple_count);
    }

    public static void main(String[] args) {

        QA2_Garden qa2 = new QA2_Garden();
        qa2.total_money();
        
    }
    
}
