
import java.util.Scanner;

public class liesBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter minimum Range: ");
        int a = sc.nextInt();
        System.out.println("Enter maximum Range: ");
        int b = sc.nextInt();

        if(n > a && n < b) {
            System.out.println("Number lies in Range");
        } else {
            System.out.println("Number does'nt lie in Range");
        }

    }
}
