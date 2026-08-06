
import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n) {
        if(n <= 1) {
            return false; 
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
