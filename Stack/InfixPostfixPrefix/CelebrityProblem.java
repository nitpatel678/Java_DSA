import java.util.*;

public class CelebrityProblem {

    // Solution class to solve the celebrity problem
    static class Solution {
        int celebrity(int M[][], int n) {
            Stack<Integer> st = new Stack<Integer>();
            
            // Step 1: Push all people to the stack
            for (int i = 0; i < n; i++) {
                st.push(i);
            }
    
            // Step 2: Find the potential celebrity
            while (st.size() > 1) {
                int v1 = st.pop();
                int v2 = st.pop();
                
                // If v1 knows v2, v1 cannot be a celebrity
                // If v2 knows v1, v2 cannot be a celebrity
                if (M[v1][v2] == 1) {
                    st.push(v2);  // v2 might be the celebrity
                } else {
                    st.push(v1);  // v1 might be the celebrity
                }
            }

            int potential =0;
    
            // Step 3: Check if the potential celebrity is valid
            if (st.isEmpty()) {
                return -1;
            } else {
                 potential = st.pop();  // We now have a single potential candidate
    
                // Check if the potential celebrity does not know anyone
                for (int i = 0; i < n; i++) {
                    if (M[potential][i] == 1) {
                        return -1;  // If the potential celebrity knows someone, they are not a celebrity
                    }
                }
    
                // Check if everyone knows the potential celebrity
                for (int i = 0; i < n; i++) {
                    if (i != potential && M[i][potential] == 0) {
                        return -1;  // If someone does not know the potential celebrity, they are not a celebrity
                    }
                }
            }
    
            // If both checks pass, return the potential celebrity
            return potential;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of people (n)
        System.out.print("Enter the number of people (n): ");
        int n = sc.nextInt();
        
        // Read the matrix M of size n x n
        int[][] M = new int[n][n];
        
        System.out.println("Enter the matrix M (" + n + " x " + n + "): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        // Create an instance of the Solution class and call the celebrity method
        Solution solution = new Solution();
        int result = solution.celebrity(M, n);

        // Output the result
        if (result == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("The celebrity is person number: " + result);
        }

        // Close the scanner to free resources
        sc.close();
    }
}
