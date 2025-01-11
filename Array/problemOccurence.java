import java.util.Scanner;
public class problemOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the size of the array:");
        int a = sc.nextInt();
        int [] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element:");
            int k = sc.nextInt();
            arr[i] = k;
        }

        System.out.println("Enter the element you wanna to search :");
        int key = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key ) {
                count = count + 1;
            }
        }

        System.out.println("Total no. of occurence:" + count);

        sc.close();
    }
}