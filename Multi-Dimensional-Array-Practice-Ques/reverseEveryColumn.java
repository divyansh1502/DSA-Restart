
import java.util.Scanner;

public class reverseEveryColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = arr.length - 1; col >= 0; col--) {
                System.out.print(arr[col][row] + " ");
            }
            System.out.println();
        }
    }
}

