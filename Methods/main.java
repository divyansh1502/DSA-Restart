import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Q: Take two numbers as input and print there sum
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + sum(a,b));
    }
    static int sum(int x, int y) {
        return x + y;
    }
}
