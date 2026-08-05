
import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual Salary: ");
        int sal = sc.nextInt();

        int tax = 0;
        if(sal <= 250000) {
            tax = 0;
        } else if (sal > 250000 && sal <= 500000) {
            tax = (sal * 5) / 100;
        } else if (sal > 500000 && sal <= 1000000) {
            tax = (sal * 20) / 100;
        } else {
            tax = (sal * 30) / 100;
        }
        int total = sal - tax;
        System.out.println("Total Tax: " + tax);
        System.out.println("Total Salary after Tax Deduction: " + total);
    }
}
