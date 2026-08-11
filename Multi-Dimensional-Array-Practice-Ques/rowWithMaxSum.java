
import java.util.Scanner;

public class rowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter elements: ");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
            int max = 0;
            int index = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if(sum > max) {
                max = sum;
                index = row;
            }
        }
        System.out.println("Row with maximum sum is at index number " + index + " with total sum: " + max);
    }
}

