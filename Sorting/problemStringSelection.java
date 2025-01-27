import java.util.*;

// Sort the array
public class problemStringSelection {

    static void problem_Sort(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < s.length; j++) {
                if (s[j].length() > s[min_index].length()) {
                    min_index = j;
                }
            }

            String s2 = s[i];
            s[i] = s[min_index];
            s[min_index] = s2;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"Mango", "Apple", "Grapes", "Kiwi"};
        
        System.out.println("Printing before sorting:");
        System.out.println(Arrays.toString(fruits)); // Use Arrays.toString to print array elements
        problem_Sort(fruits);
        System.out.println("Printing after sorting:");
        System.out.println(Arrays.toString(fruits));
    }
}
