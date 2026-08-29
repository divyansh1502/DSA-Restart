
import java.util.Arrays;

public class rowColMatrixBS {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {22, 28, 37, 49},
            {26, 29, 39, 50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            } else if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
