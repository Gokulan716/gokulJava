
interface  Reabable {
    void  read();
   }
   interface  Writable {
      void write();
   }
   interface  Storable {
       void store();
   }

public class Nov_11_Interface_multiple implements Reabable, Writable, Storable{
    public  void read(){
        System.out.println("Read method");
     }
     public void write(){
        System.out.println("Write method");
     }
     public void store(){
        System.out.println("Store method");
     }
    public static void main(String[] args) {
       
        Nov_11_Interface_multiple f1= new Nov_11_Interface_multiple();
        f1.read();
        f1.write();
        f1.store();

        
    }
}