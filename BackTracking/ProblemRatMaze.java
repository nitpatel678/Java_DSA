import java.util.*;
public class ProblemRatMaze{
    private static int maze(int Srow, int Scol, int Erow, int Ecol){
        if(Scol == Ecol && Srow == Erow){
            return 1;
        }
        if(Srow>Erow||Scol>Ecol){
            return 0;
        }
        int down = maze(Srow+1, Scol, Erow, Ecol);
        int right = maze(Srow, Scol+1, Erow, Ecol);
        int total = down + right;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println("Total number of unique paths: " + count);
        // Close the scanner to free resources
        sc.close();
    }
}