import java.util.Random;
public class qa5_for_while {
    public static void main(String[] args) {
        int i=0;
        while(i<2){
            System.out.println("Gokul");
            i=i+1;
        }
        int randnum =0;
        Random rand = new Random();
        while (randnum!=5){
            randnum = rand.nextInt(10);
            System.out.println(randnum);
        }
    }
}