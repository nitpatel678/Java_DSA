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
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();

        // Corrected: Start from the last valid index (n - 1)
        int result = linear_search(arr, n - 1, key);

        if (result == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + result);
        }

        sc.close();
    }
}
