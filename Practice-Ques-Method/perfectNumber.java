
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        perfectNumber(n);
    }
    static void perfectNumber(int n) {

        int original = n;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == original) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect Numebr");
        }
    }
}
