public class For_each_Oct17 {
    public static void main(String[] args) {
        int gum[]= {1,2,3,4,5};
        for(int i=0; i<=4; i=i+1){
            System.out.println(gum[i]);
        }
        System.out.println();
        for (int gan:gum){
            System.out.println(gan);
        }
        System.out.println();
        String nan[]={"Gokul", "Archana", "Hema", "Gowtham"};
        for (String gan:nan){
            System.out.println(gan);
        }
    }
}
