

import java.util.Scanner;

public class searchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        searchElement(arr,target);
    }
    static void searchElement(int[][] arr, int target) {
        int odd = 0;
        int even = 0;
        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    System.out.println("Target found at index number: row: " + row + " col: "+ col);
                    found = true;
                    break;
                }
            }
            }
            if(!found) {
                System.out.println("Target not found");
        }
    }
}


