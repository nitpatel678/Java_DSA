import java.util.Scanner;

public class ProblemRemoveStringOccurrence {
    static String remove_str(String str, int index, char key) {
        // Base case: if index is out of bounds, return an empty string
        if (index < 0) {
            return "";
        }

        // Recursive call to process the previous characters
        String A = remove_str(str, index - 1, key);
        char c = str.charAt(index);

        // If the current character is not the key, include it in the result
        if (c != key) {
            return A + c; // Append the character to the result
        } else {
            return A; // Skip the character
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: String and character key
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Enter the key character:");
        char c = sc.next().charAt(0); // Reading a single character as key

        // Processing the string to remove occurrences of the key character
        String result = remove_str(s, s.length() - 1, c);

        // Output the modified string
        System.out.println("Resulting string: " + result);

        // Close the scanner to free resources
        sc.close();
    }
}
