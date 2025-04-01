import java.util.*;

public class PublicStatic4D {
    // Applying Ghibli Art
    private static int maze4d(int Srow, int Scol, int Erow, int Ecol, boolean[][] isVisited){
        // Base cases
        if (Srow < 0 || Scol < 0 || Srow >= isVisited.length || Scol >= isVisited[0].length || isVisited[Srow][Scol]) {
            return 0;  // Out of bounds or already visited
        }

        // If we've reached the destination, return 1 path found
        if (Srow == Erow && Scol == Ecol) {
            return 1;
        }

        // Mark the current cell as visited
        isVisited[Srow][Scol] = true;

        // Initialize the path count
        int pathCount = 0;

        // Go down
        pathCount += maze4d(Srow + 1, Scol, Erow, Ecol, isVisited);
        // Go right
        pathCount += maze4d(Srow, Scol + 1, Erow, Ecol, isVisited);
        // Go left
        pathCount += maze4d(Srow, Scol - 1, Erow, Ecol, isVisited);
        // Go up
        pathCount += maze4d(Srow - 1, Scol, Erow, Ecol, isVisited);

        // Unmark the current cell to allow for other paths
        isVisited[Srow][Scol] = false;

        return pathCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];

        // Counting unique paths
        int count = maze4d(0, 0, rows - 1, cols - 1, isVisited);
        System.out.println("Total number of unique paths: " + count);

        // Close the scanner to free resources
        sc.close();
    }
}
