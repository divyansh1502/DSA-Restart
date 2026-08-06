import java.util.Scanner;


public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        div(a,b);
    }
    static void div(int x, int y) {
        if(y == 0) {
            System.out.println("Cannot divide by 0");
        }
        else {
        int div = x / y;
        System.out.println("Answer: " + div);
        }
    }
}
