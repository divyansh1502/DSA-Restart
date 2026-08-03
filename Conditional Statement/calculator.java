import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user until user press X or x

        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                break;
            }
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // taking two numbers
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    System.out.println(num1 + num2);
                }
                else if (op == '-') {
                    System.out.println(num1 - num2);
                }
                else if (op == '*') {
                    System.out.println(num1 * num2);
                }
                else if (op == '/') {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    }
                }
                else if (op == '%') {
                    System.out.println(num1 % num2);
                }
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}
//