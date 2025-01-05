import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        // if (a > 99) {
        //     System.out.println("Number is triple");
        // }
        // else if(a<0){
        //     System.out.println("Number is negative");
        // }
        // else{
        //     System.out.println("Number is within range");
        // }

        // TO check the no if divisble by 3 and 5 and also 15

        if (a % 3 == 0 && a % 5 == 0) {
            if (a % 15 == 0) {
                System.out.println("Number is divisble by 3,5 and 15");
            }
            else{
                System.out.println("Number is divisble by 3,5 and not divisble by 15");
            }
        }
        else{
            System.out.println("Number is not divisble by 3,5 and not divisble by 15");
        }


        // Close the scanner to free resources
        sc.close();
    }
}