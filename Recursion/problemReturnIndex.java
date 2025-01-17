import java.util.Scanner;
public class problemReturnIndex {
    static int key_index(int [] arr, int size, int key){
        if (size <0) {
            return -1;
        }
        else if (arr[size] == key) {
            return size;
        }
        return key_index(arr, size-1, key);
        
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
        System.out.println("Enter the key:");
        int key = sc.nextInt();

        int result = key_index(arr, n - 1, key);
        if (result==-1) {
            System.out.println("Key was not found");
        }
        else{
            System.out.println("Key was found at the index " + result);
        }

        sc.close();
    }
}