import java.util.Scanner;


public class mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        mul(a,b);
    }
    static void mul(int x, int y) {
        int mul = x * y;
        System.out.println("Answer: " + mul);
    }
}
