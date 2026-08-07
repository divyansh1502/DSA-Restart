
import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        strongNumber(n);
    }
    static void strongNumber(int n) {
        int original = n;
        int sum = 0;
        while(n > 0) {
            int fact = 1;
            int rem = n  % 10;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            n /= 10;
            sum += fact;
        }
        if(sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
