import java.util.*;
public class problem2DMatrix {
    static int binary_search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            long square = (long) arr[mid] * arr[mid]; // Prevent integer overflow

            if (square == key) {
                return 1;
            } else if (square < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}