
import java.util.Scanner;


public class maxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        max(a,b,c);
    }
    static void max(int x, int y, int z) {
        if(x > y && x > z) {
            System.out.println(x + " is greatest");
        } else if(y > x && y > z) {
            System.out.println(y + " is greatest");
        } else {
            System.out.println(z + " is greatest");
        }
    }
}
