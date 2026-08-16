

public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 565},
            {16, 35}
        };
        
        System.out.println(search(arr));
    }
    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

