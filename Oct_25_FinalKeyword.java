// Final keyword is something which cannot be modified which applies to class, varriable and method
// we can't overide the final method, we can't extends the final class
class figma{
    final void game(){
        System.out.println("Final test game");
    }
    void game2(){
        System.out.println("New test game");
    }
}
class marima extends figma
{
     @Override
     void game2() {
        System.out.println("Overritten game");
     }}

  public class Oct_25_FinalKeyword {

final int na=20;
public static void main(String[] args) {
    marima ma= new marima();
    ma.game();
    ma.game2();
    System.out.println(ma.na);   
}
}

