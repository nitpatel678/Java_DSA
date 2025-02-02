import java.util.*;

public class problemSquareRoot {
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

    static int[] create_array(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = create_array(n);

        System.out.println("Enter the square to check: ");
        int a = sc.nextInt();

        int result = binary_search(arr, a);
        if (result != -1) {
            System.out.println("The square is found.");
        } else {
            System.out.println("The square is not found.");
        }
        sc.close();
    }
}
