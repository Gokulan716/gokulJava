public class This_keyword_use {

    String name;
/*If you run the get the below method will get the value as null why be beacuse value which we passing inside the method it's getting null beacuse of the instance variable 
   void set_name(String name){
      name = name;
    } 
 */
// If you run the get the below method will get the value as Hari why be beacuse we declaring intance variable by using this keyword
// The this keyword in Java is a reference variable that refers to the current object. It is used within an instance method or a constructor to access members of the current object such as instance variables, methods, and constructors.

void set_name(String name){
    this.name = name;
  }
    public static void main(String[] args) {
        
        This_keyword_use k1 = new This_keyword_use();
        k1.set_name("Hari");
      System.out.println(k1.name);
    }
}
