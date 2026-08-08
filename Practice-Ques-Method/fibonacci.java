
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibo(n);
    }
    static void fibo(int n) {
        if(n <= 0) {
            return;
        }
        int a = 0;
        int b = 1;

        System.out.println(a);

        if(n == 1) {
            return;
        }

        System.out.println(b);

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}
