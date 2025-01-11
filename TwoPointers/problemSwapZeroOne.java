import java.util.Scanner;

class arrayFunction {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroAndOne(int arr[], int size) {
        int left = 0;
        int right = size - 1;

        while (left < right) {
            // Only swap if arr[left] is 1 and arr[right] is 0
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            // Move left pointer forward if it's already 0
            if (arr[left] == 0) {
                left++;
            }

            // Move right pointer backward if it's already 1
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

public class problemSwapZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        arrayFunction.print_array(arr);

        arrayFunction.sortZeroAndOne(arr, n);

        System.out.println("After sorting:");
        arrayFunction.print_array(arr);

        sc.close();
    }
}
