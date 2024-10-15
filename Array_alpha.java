import java.util.Arrays;
public class Array_alpha {

    public static void main(String[] args) {
        // Example array
        String[] fruits = {"Banana", "Apple", "Orange", "Mango", "Grapes"};

        // Sorting the array in alphabetical order
        Arrays.sort(fruits);

        // Displaying the sorted array
        System.out.println("Array elements in alphabetical order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

