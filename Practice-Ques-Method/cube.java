
import java.util.Scanner;


public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know its square: ");
        int n = sc.nextInt();

        cube(n);
    }
    static void cube(int n) {
        int c = n * n *n;
        System.out.println("Cube of " + n + " is : " + c);
    }
}
