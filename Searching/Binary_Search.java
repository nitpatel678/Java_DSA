import java.util.*;
public class Binary_Search {
    class arrayPart {

        static int binary_search(int[]arr, int key){
            int low = 0 , high = arr.length-1;
            while (low<=high) {
                int mid = (low+high)/2;
                if (arr[mid]==key) {
                    return 1;
                }
                else if (arr[mid]<key) {
                    low = mid + 1;   
                }
                else if (arr[mid]>key) {
                    high = mid - 1;
                }
            }

            return -1;
        }

        static void print_array(int[] arr) {
            System.out.println("Printing the 1D array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println(); 
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
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int a = sc.nextInt();
        int [] array = arrayPart.create_array(a);
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();
        int result = arrayPart.binary_search(array, key);
        if (result != -1) {
            System.out.println("Key element found");
        }
        else{
            System.out.println("Key element not found");
        }
        sc.close();
    }
}