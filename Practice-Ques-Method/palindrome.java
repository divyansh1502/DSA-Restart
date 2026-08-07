
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        reverse(n);
    }
    static void reverse(int n) {
        int original = n;
        int reverse = 0;
        while(n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        if(original == reverse) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
