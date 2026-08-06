import java.util.Scanner;


public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        sub(a,b);
    }
    static void sub(int x, int y) {
        int sub = x - y;
        System.out.println("Answer: " + sub);
    }
}
