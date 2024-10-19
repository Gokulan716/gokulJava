public class Parameterrized_Constructor {

    Parameterrized_Constructor(){
      System.out.println("This -- Constructor With out variables");
    }

    Parameterrized_Constructor(int a, String b){
        System.out.println(a+" "+ b);
    }
    public static void main(String[] args) {
        Parameterrized_Constructor ab1= new Parameterrized_Constructor();
        Parameterrized_Constructor ab2= new Parameterrized_Constructor(33, "This String from ab2");
    }
}
