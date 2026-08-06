
import java.util.Scanner;


public class maxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        max(a,b);
    }
    static void max(int x, int y) {
        if(x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(y + " is greater than " + x);
        }
    }
}
