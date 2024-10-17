public class Method_overloading_Oct17 {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }   public static void main(String [] args){

            Method_overloading_Oct17 obj = new Method_overloading_Oct17();
            obj.sum(1, 324);
            obj.sum(90, 90,90);
        }
}
