    
import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to check its occurence: ");
        int target = sc.nextInt();
        frequency(arr,target);
    }
    static void frequency(int[][] arr, int target) {

        int n = 0; 
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    n++;
                }
            }
        }
        System.out.println("Occurence of target number is: " + n);
    }
}





