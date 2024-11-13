
interface ABD{
    void something();
}

interface CBD{
    void mapping ();
}
class Nov13_Lampda_Expresstion{

    public static void main(String [] args){

        // Created a functional interface to create a object for the interface
        ABD obj1= new ABD(){
         public void something(){
           System.out.println("Do somthing");}
        };
        obj1.something();

//Lampda_Expresstion to solve the above problem in simple expresstion 

        CBD obj2 = ()-> {System.out.println("Do Mapping");};
        obj2.mapping();
        

    }

}