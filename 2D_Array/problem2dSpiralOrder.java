import java.util.Scanner;

class arrayPart {
    static void print_2darray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print_array(int[] arr) {
        System.out.println("Printing the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    static int[][] create2d_array(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void spiral_array(int[][] arr, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int elementCount = 0;
        int totalElements = rows * cols;

        System.out.println("Spiral order traversal:");
        while (elementCount < totalElements) {
            // Traverse from left to right
            for (int i = left; i <= right && elementCount < totalElements; i++) {
                System.out.print(arr[top][i] + " ");
                elementCount++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom && elementCount < totalElements; i++) {
                System.out.print(arr[i][right] + " ");
                elementCount++;
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left && elementCount < totalElements; i--) {
                System.out.print(arr[bottom][i] + " ");
                elementCount++;
            }
            bottom--;

            // Traverse from bottom to top
            for (int i = bottom; i >= top && elementCount < totalElements; i--) {
                System.out.print(arr[i][left] + " ");
                elementCount++;
            }
            left++;
        }
        System.out.println();
    }
}

public class problem2dSpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();

        // Create and print the matrix
        int[][] arr = arrayPart.create2d_array(n, n);
        System.out.println("Matrix before spiral:");
        arrayPart.print_2darray(arr);

        System.out.println("After spiral:");

        // Print the matrix in spiral order
        arrayPart.spiral_array(arr, n, n);

        // Close the scanner
        sc.close();
    }
}
