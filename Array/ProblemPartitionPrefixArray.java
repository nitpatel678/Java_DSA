import java.util.Scanner;

class ArrayFunction {
    static void print_array(int arr[]) {
        System.out.println("Printing array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // To add a new line after printing the array
    }

    static boolean canBePartitioned(int arr[]) {
        int n = arr.length;
        if (n % 2 != 0) {
            // Partitioning into two equal halves is not possible for an odd-sized array
            return false;
        }

        int[] firstarr = new int[n / 2];
        int[] secondarr = new int[n / 2];

        // Compute prefix sum for the first half
        firstarr[0] = arr[0];
        for (int i = 1; i < n / 2; i++) {
            firstarr[i] = firstarr[i - 1] + arr[i];
        }

        // Compute prefix sum for the second half
        secondarr[0] = arr[n / 2];
        for (int i = n / 2 + 1; i < n; i++) {
            secondarr[i - n / 2] = secondarr[i - n / 2 - 1] + arr[i];
        }

        // Check if any prefix sum of the first half matches the second half
        for (int i = 0; i < n / 2; i++) {
            if (firstarr[i] == secondarr[i]) {
                return true;
            }
        }
        return false;
    }
}

public class ProblemPartitionPrefixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size (must be even):");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Array size must be even!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }

        boolean found = ArrayFunction.canBePartitioned(arr);

        if (found) {
            System.out.println("This array can be equally partitioned.");
        } else {
            System.out.println("This array cannot be equally partitioned.");
        }

        sc.close();
    }
}
