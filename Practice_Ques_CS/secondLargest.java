
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if(a > b && a < c) {
            System.out.println("Second largest: " + a);
        } else if(b > a && b < c) {
            System.out.println("Second largest: " + b);
        } else {
            System.out.println("Second largest: " + c);
        }
    }
}
