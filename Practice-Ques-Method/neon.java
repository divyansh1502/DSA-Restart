
import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        neonNumber(n);
    }
    static void neonNumber(int n) {
        int original = n;
        int square = n * n;
        int sum = 0;
        while(square > 0) {
            int rem = square % 10;
            sum += rem;
            square /= 10;
        }
        if(original == sum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a neon number");
        }
    }
}
