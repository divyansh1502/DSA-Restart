
    import java.util.Scanner;

public class sumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(row == col) {
                    sum += arr[row][col];
                }
            }
        }
        System.out.println("Sum of Main Diagonal is: " + sum);
    }
}




