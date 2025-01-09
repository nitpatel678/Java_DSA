import java.util.Scanner;

// constructor name should be same as the class name 
class Algebra {

    int a, b;

    Algebra(int x, int y) {
        System.out.println("Constructor is being called:");
        a = x;
        b = y;
    }

    int add(){
        int ans = a + b;
        return ans;
    }

    int substract(){
        int subans = a - b;
        return subans;
    }

}

public class construct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra obj = new Algebra(5,6); 

          System.out.println("Sum of the two given no : ");
          int ans = obj.add();
          System.out.println(ans);


        // Close the scanner to free resources
        sc.close();
    }
}