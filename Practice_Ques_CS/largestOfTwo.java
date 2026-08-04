
import java.util.Scanner;


public class largestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
