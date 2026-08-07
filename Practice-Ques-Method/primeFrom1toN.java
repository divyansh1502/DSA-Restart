
import java.util.Scanner;

public class primeFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        rangePrime(n);
    }
    static void rangePrime(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println(i);
            }
        }
    }
}
