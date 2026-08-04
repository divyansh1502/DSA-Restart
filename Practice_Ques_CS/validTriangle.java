
import java.util.Scanner;


public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st angle of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd angle of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd angle of triangle: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        if(sum == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
