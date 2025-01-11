import java.util.Scanner;

public class problemCheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        // Check if array is sorted
        boolean isSorted = true; // Assume sorted initially

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false; // Found unsorted pair
                break; // No need to continue further
            }
        }

        // Output result
        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        sc.close();
    }
}
