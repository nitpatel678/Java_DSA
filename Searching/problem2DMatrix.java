import java.util.*;

public class problem2DMatrix {
    static int[] binarySearch(int[][] arr, int key) {
        int n = arr.length, m = arr[0].length;
        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int element = arr[mid / m][mid % m]; // Convert 1D index to 2D matrix coordinates

            if (element == key) {
                return new int[]{mid / m, mid % m}; // Return row and column index
            } else if (element < key) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }
        return new int[]{-1, -1}; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example matrix
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int[] result = binarySearch(matrix, key);

        if (result[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at row " + result[0] + ", column " + result[1]);
        }

        sc.close();
    }
}
