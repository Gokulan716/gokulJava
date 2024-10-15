
public class para_args {

    void soap(int money){
        System.out.println(money);
        System.out.println("Soap purchased");
    }
    void Chocolate(int money ){
        System.out.println(money);
        System.out.println("Chocolate purchased");
    }

    public static void main(String []args){

        para_args pra = new para_args();
        pra.Chocolate(5);

        pra.soap(20);

    }
}