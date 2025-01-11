import java.util.Scanner;

class arrayFunction {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEvenOdd(int arr[], int size) {
        int left = 0;
        int right = size - 1;

        while (left < right) {
            // Swap when left points to odd and right points to even
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            // Move left pointer forward if it's already even
            if (arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer backward if it's already odd
            if (arr[right] % 2 != 0) {
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

public class problemEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        arrayFunction.print_array(arr);

        arrayFunction.sortEvenOdd(arr, n);

        System.out.println("After sorting:");
        arrayFunction.print_array(arr);

        sc.close();
    }
}
