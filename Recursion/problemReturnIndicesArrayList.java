import java.util.ArrayList;
import java.util.Scanner;
public class problemReturnIndicesArrayList {

    // Function to find indices of key1 and key2 in the array recursively
    static void findIndices(int[] arr, int index, int key1, int key2, ArrayList<Integer> indices) {
        if (index < 0) {
            return; // Base case: End of array
        }
        
        if (arr[index] == key1 || arr[index] == key2) {
            indices.add(index); // Add index to ArrayList if key1 or key2 is found
        }
        
        findIndices(arr, index - 1, key1, key2, indices); // Recursive call for the previous index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the first key:");
        int key1 = sc.nextInt();

        System.out.println("Enter the second key:");
        int key2 = sc.nextInt();

        ArrayList<Integer> indices = new ArrayList<>();
        findIndices(arr, n - 1, key1, key2, indices);

        System.out.println("Indices of " + key1 + " and " + key2 + ": " + indices);

        // Close the scanner to free resources
        sc.close();
    }
}
