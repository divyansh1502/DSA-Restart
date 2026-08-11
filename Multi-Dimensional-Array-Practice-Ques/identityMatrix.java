
import java.util.Scanner;


public class identityMatrix {
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
            for (int col = 0; col < arr[row].length; col++) {
                if(row != col) {
                    System.out.print(arr[row][col] - arr[row][col] + " ");
                } else {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}


