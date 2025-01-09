import java.util.Scanner;
public class introduction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int [] arr = new int [a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("Enter the element:");
            int k = sc.nextInt();
            arr[i] = k;
        }

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i]+"\t");
        }

        sc.close();
    }
}
