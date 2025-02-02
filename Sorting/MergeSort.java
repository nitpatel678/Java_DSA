import java.util.*;

public class MergeSort {

    static void MergeArray(int[] arr, int l, int mid, int r) {
        int subarray1 = mid - l + 1;
        int subarray2 = r - mid;
        int[] left = new int[subarray1];
        int[] right = new int[subarray2];
        int i, j, k;
        for (i = 0; i < subarray1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < subarray2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        i = 0;
        k = l;
        j = 0;
        while (i < subarray1 && j < subarray2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < subarray1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < subarray2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void MergeSort_Sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        MergeSort_Sort(arr, l, mid);
        MergeSort_Sort(arr, mid + 1, r);
        MergeArray(arr, l, mid, r);
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
        MergeSort_Sort(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        sc.close();
    }
}
