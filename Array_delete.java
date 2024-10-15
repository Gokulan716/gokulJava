/**
 * Array_delete
 */
import java.util.Arrays;
public class Array_delete {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToDelete = 2; // Index of the element to delete (value 3 in this case)

        // Check if the index is valid
        if (indexToDelete < 0 || indexToDelete >= arr.length) {
            System.out.println("Index out of bounds");
        } else {
            // Shift elements to the left to fill the gap
            for (int i = indexToDelete; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Reduce the array size by one
            arr = Arrays.copyOf(arr, arr.length - 1);
            System.out.println(arr.length);

            // Print the new array
            System.out.println("Array after deletion: " + Arrays.toString(arr));
    }

    }
}
