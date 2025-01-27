import java.util.*;
// Move all zero to end in an array.

public class problemSorting {

    static void problem_Sort(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;
    
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
    
                nonZeroIndex++;
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

        System.out.println("Before sorting the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nAfter sorting the array:");
        problem_Sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        sc.close();
    }
}
