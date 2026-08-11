
import java.util.Scanner;


public class checkIdentity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        boolean identity = true;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(row == col && arr[row][col] != 1) {
                    identity = false;
                }
                if(row != col && arr[row][col] != 0) {
                    identity = false;
                }
            }
        }
        if(!identity) {
            System.out.println("Not a identity Matrix");
        } else {
            System.out.println("Identity Matrix");
        }
    }
}

