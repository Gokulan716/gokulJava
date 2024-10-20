
//This is Hierarchical.  (Its combination of all types)
 class GrandFather {
    void home(){
        System.out.println("Lands, gold Dimond");
    }
}

 class Father extends GrandFather{
  void money(){
    System.out.println("For shopping");
  }
}

 class son extends Father {
void play_cricket(){
    System.out.println("Play cricket");
}
}
class Daughter extends Father {

    void sing_song(){
        System.out.println("Singging song");
    }
}
 class Father_Bother extends GrandFather{
 void Drinker(){
        System.out.println("Drinking 24/7");
    }
 }

public class OCT_20_Hybrid_Inheritance {

    public static void main(String []args){
        Daughter d1= new Daughter();
        d1.sing_song();
        d1.home();
        d1.money();
        son s1= new son();
        s1.play_cricket();
        s1.money();
        s1.home();
        Father_Bother f2 =new Father_Bother();
        f2.Drinker();
        f2.home();

    }
    
}
