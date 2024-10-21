//The super keyword in Java is used to refer to the immediate parent class object. 
//It allows you to access methods, constructors, and fields of the parent class. Here are the main uses of the super keyword 
  class person {
    String name;
    person(String name){
      this.name=name;
    }
}

//Calling the Parent Class Constructor
 class Employee extends person {
     int emp_id;
     Employee(String name){
         super(name);
     }
 }
 //When a subclass constructor is called, it can use super() to call the constructor of the parent class.
 //This is particularly useful when the parent class has a parameterized constructor and you need to initialize inherited fields.
 public class Oct21_Super_Keyword {

    public static void main(String[] args) {
        Employee e1= new Employee("Jannu");
        e1.emp_id=532;
        System.out.println(e1.name);
        System.out.println(e1.emp_id);

    }
}
