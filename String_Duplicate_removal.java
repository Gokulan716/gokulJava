import java.util.ArrayList;

class String_Duplicate_removal {
    public static void main(String[] args) {
        int[] ab = {2,1, 1, 1};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < ab.length; i++) {
            if (i < ab.length - 1 && ab[i] == ab[i + 1]) {
                continue;  
            }
            list.add(ab[i]);
        }

     
        for (int item : list) {
            System.out.print(item+" ");
        }
    }
}
