
import java.util.Scanner;


public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know its square: ");
        int n = sc.nextInt();

        square(n);
    }
    static void square(int n) {
        int s = n * n;
        System.out.println("Square of " + n + " is : " + s);
    }
}
