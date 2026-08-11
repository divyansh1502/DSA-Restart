import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        countOddEven(arr);
    }
    static void countOddEven(int[][] arr) {
        int odd = 0;
        int even = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
