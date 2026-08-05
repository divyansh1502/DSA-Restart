import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 1st number: ");
        float a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextInt();
        float ans = 0;
        if(op == '+') {
            ans = a + b;
        } else if(op == '-') {
            ans = a - b;
        } else if(op == '*') {
            ans = a * b;
        } else if (op == '/') {
            if(b != 0) {
                ans = a / b;
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else if(op == '%') {
            ans = a % b;
        } else {
            System.out.println("Please enter a valid operator");
        }
        System.out.println("Result: " + ans);
    }
}