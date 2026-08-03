
import java.util.Scanner;


public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter the nth term for the fibonacci number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int fibo = 0;
        for (int i = 1; i < n; i++) {
            fibo = a + b;
            a = b;
            b= fibo;
        }
        System.out.println(fibo);
    }
}
