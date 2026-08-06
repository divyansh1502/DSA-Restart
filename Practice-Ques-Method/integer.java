
import java.util.Scanner;


public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        check(n);
    }
    static void check(int x) {
        if(x < 0) {
            System.out.println("Negative number");
        } else if(x > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Zeroooooooo");
        }
    }
}
