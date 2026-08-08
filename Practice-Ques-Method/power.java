
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();

        power(b,p);
    }
    static void power(int x, int y) {
        if(x >= 0 && y == 0) {
            System.out.println("1");
        }
        double result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        System.out.println(result);
    }
}
