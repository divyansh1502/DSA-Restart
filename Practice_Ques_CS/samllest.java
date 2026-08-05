import java.util.Scanner;

public class samllest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();
        

        if(a < b && a < c && a < d) {
            System.out.println("Smallest: " + a);
        } else if(b < a && b < c && b < d) {
            System.out.println("Smallest: " + b);
        } else if(c < a && c < b && c < d) {
            System.out.println("Smallest: " + c);
        } else {
            System.out.println("Smallest: " + d);
        }
    }
}
