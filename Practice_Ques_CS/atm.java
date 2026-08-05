import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Balance Enquiry:\nEnter 2 for Deposit:\nEnter 3 for Withdraw:\nEnter 4 for Exit:\n");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Balance Check");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Withdraw");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}