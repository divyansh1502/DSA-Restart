public class spiralMatrix {
    public static void main(String[] args) {

        int[][] arr = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int col = left; col <= right; col++) {
                System.out.print(arr[top][col] + " ");
            }
            top++;

            // Top → Bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(arr[row][right] + " ");
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(arr[bottom][col] + " ");
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(arr[row][left] + " ");
                }
                left++;
            }
        }
    }
}