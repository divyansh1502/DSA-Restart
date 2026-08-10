import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {7, 54, 69, 7, 54, 24, 54, 7, 26, 54, 7, 86, 7, 8, 7};

        System.out.print("Enter a number to check its frequency: ");
        int n = sc.nextInt();

        frequency(arr,n);
    }
    static void frequency(int[] arr, int n) {
        int count = 0;
        for(int num : arr) {
            if(num == n) {
                count++;
            }
        }
        System.out.print("Frequency of " + n + " is: " + count);
    }
}
