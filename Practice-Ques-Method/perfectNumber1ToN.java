
import java.util.Scanner;

public class perfectNumber1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        perfectNumber(n);
    }

    static void perfectNumber(int n) {

        for (int i = 1; i <= n; i++) {

            int original = i;
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == original) {
                System.out.println("Perfect Number:" + original);
            }
        }
    }
}