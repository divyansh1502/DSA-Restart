

    import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        min(arr);
    }
    static void min(int[][] nums) {
        int row = 0;
        int col = 0;
        int min = nums[row][col];
        for (row = 0; row < nums.length; row++) {
            for (col = 0; col < nums[row].length; col++) {
                if(nums[row][col] < min) {
                    min = nums[row][col];
                }
            }
        }
        System.out.println("Minimum: " + min);
    }
}


