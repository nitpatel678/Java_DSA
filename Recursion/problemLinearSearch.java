import java.util.Scanner;
public class problemLinearSearch {
    static int linear_search(int[] arr, int index, int key) {
        // Base case: If index goes out of bounds
        if (index < 0) {
            return -1; // Key not found
        }
        // Check if the current element matches the key
        if (arr[index] == key) {
            return index; // Key found at index
        }
        // Recursive call to search the rest of the array
        return linear_search(arr, index - 1, key);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}