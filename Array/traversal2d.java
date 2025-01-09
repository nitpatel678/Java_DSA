import java.util.Scanner;

class arrayExample {
    public void multidimensional() {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Print the elements of the 2D array using nested loops
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

public class traversal2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayExample obj = new arrayExample();

        // Call the multidimensional method
        obj.multidimensional();

        // Close the scanner to free resources
        sc.close();
    }
}
