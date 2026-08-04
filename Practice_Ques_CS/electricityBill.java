
import java.util.Scanner;


public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int n = sc.nextInt();
        System.out.print("Enter cost of 1 unit: ");
        float u = sc.nextFloat();

        float bill = n * u;

        System.out.println("Bill of " + n + " units is : " + bill);
    }
}
