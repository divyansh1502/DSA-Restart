import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
