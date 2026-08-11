import java.util.Scanner;

public class sumOfBothDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        int sumMain = 0;
        int sumSecondary = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(row == col) {
                    sumMain += arr[row][col];
                }
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(row + col == arr.length - 1) {
                    sumSecondary += arr[row][col];
                }
            }
        }
        System.out.println("Sum of Both Diagonal is: " + (sumMain + sumSecondary));
    }
}



