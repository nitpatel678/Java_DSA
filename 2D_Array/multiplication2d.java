import java.util.Scanner;

class arrayFunction{
    static void print_array(int arr[][]){
        System.out.println("Printing array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int [][] mutiply_array(int arr1[][],int arr2[][], int size){
        int [][] com = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    com[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return com;
    }
}

public class multiplication2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [][] arr1 = new int[n][n];
        int [][] arr2 = new int[n][n];
        System.out.println("Enter the element of the first array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                arr1[i][j] = k;
            }
        }

        System.out.println("Enter the element of the second array:"); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                arr2[i][j] = k;
            }
        }

        int [][] result = arrayFunction.mutiply_array(arr1, arr2, n);
        arrayFunction.print_array(result);

        sc.close();
    }
}