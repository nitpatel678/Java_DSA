import java.util.*;
public class problemStringPalindrome {
    static boolean is_Palindrome(String s , int l, int r){
        if (l>= r) {
            return true;
        }
        return (s.charAt(l) == s.charAt(r) &&  is_Palindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int r = s.length();
        r = r-1;
        int l = 0;
        System.out.println("Checking if palindrome or not........");
        if (is_Palindrome(s,l,r)) {
            System.out.println(s + " is a palindrome");
        }
        else{
            System.out.println(s + " is not a palindrome");
        }
        // Close the scanner to free resources
        sc.close();
    }
}