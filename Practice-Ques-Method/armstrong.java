
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        armstrong(n);
    }
    static void armstrong(int n) {
        int sum = 0;
        int original = n;
        while(n > 0) {
            int rem = n % 10; 
            sum = sum + (rem*rem*rem);
            n /= 10;
        }
        if(original == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
    }
}
