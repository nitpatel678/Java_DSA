import java.util.*;

public class BubbleSort {

    // Function to perform Bubble Sort
    static void Bubble_Sort(int[] arr) {
        int n = arr.length;
        
        // Outer loop to traverse through all the elements
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 1; j < n - i - 1; j++) {
                // Swapping elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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
        
        // Printing the array before sorting
        System.out.println("Before sorting the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        
        // Calling the Bubble Sort function
        System.out.println("\nAfter sorting the array:");
        Bubble_Sort(arr);
        
        // Printing the array after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // Close the scanner to free resources
        sc.close();
    }
}
