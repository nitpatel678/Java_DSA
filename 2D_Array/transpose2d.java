import java.util.Scanner;

class Array2D {
    static void print_array(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // Use arr[i].length for column count
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void transpose2d(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {  // Start j at i + 1 to avoid redundant swaps
                // Swap elements
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}

public class transpose2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the array before transpose:");
        Array2D.print_array(arr);
        
        Array2D.transpose2d(arr);

        System.out.println("Printing the array after transpose:");
        Array2D.print_array(arr);

        // Close the scanner to free resources
        sc.close();
    }
}
