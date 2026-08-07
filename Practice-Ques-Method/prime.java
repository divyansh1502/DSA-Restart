
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        prime(n);
    }
    static void prime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
