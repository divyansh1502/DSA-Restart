
import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
 
        countDigit(n);
    }
    static void countDigit(int n) {
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        } 
        System.out.println("Number of digit: " + count);
    }
}
