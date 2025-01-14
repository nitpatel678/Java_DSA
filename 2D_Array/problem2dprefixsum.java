import java.util.Scanner;
class arrayPart {
    static void print_array(int[][] arr) {
        System.out.println("Printing the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print_array(int[] arr) {
        System.out.println("Printing the 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // Add a line break at the end
    }

    static int[][] create2d_array(int x, int y) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[x][y];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static int[] create_array(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int get_prefixsum(int arr[][], int r1,int r2,int l1,int l2) {
        int sum = 0;
        for (int i = r1; i < r2; i++) {
            for (int j = l1; j < l2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
public class problem2dprefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int a = sc.nextInt();
        int [][] arr = arrayPart.create2d_array(a, a);
        System.out.println("Enter the starting row and ending row :");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Enter the starting column and ending column");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        System.out.println("Printing array before sum for reference:");
        arrayPart.print_array(arr);

        int sum = arrayPart.get_prefixsum(arr, r1, r2, l1, l2);
        System.out.println("Sum of the prefix sum:");
        System.out.println(sum);

        // Close the scanner to free resources
        sc.close();
    }
}