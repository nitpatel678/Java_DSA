import java.util.*;
public class problem2DMatrix {
    static int binary_search(int[][] arr, int key) {
      int n = arr.length, m = arr[0].length;
      int low = 0 , high = n*m-1;
      while (low <= high) {
        int mid = (low + high) / 2;
        int element = arr[mid/m][mid%m];
        if (element==key) {
            return mid;
        }
        else if (element<key) {
            high = mid-1;
        }
        else{
            low = mid+1;
        }
      }

    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}