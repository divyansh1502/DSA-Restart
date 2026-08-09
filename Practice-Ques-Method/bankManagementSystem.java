import java.util.Scanner;

public class bankManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static double balance = 0;
    static String name;
    static long accountNumber;
    static String address;
    static boolean accountCreated = false;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Account Details");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    checkBalance();
                    break;

                case 3:
                    deposit();
                    break;

                case 4:
                    withdraw();
                    break;

                case 5:
                    transfer();
                    break;

                case 6:
                    accountDetails();
                    break;

                case 7:
                    System.out.println("Thank you for using our Bank!");
                    return;

                default:
                    System.out.println("Invalid Input!");
            }
        }
    }

    static void createAccount() {

        if (accountCreated) {
            System.out.println("Account already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your account number: ");
        accountNumber = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter your address: ");
        address = sc.nextLine();

        System.out.print("Enter amount you want to deposit: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        balance = amount;
        accountCreated = true;

        System.out.println("\nAccount Created Successfully!");
        accountDetails();
    }

    static void checkBalance() {

        if (!accountCreated) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.println("Current Balance: Rs. " + balance);
    }

    static void deposit() {

        if (!accountCreated) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.print("Enter amount you want to deposit: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully!");
            System.out.println("New Balance: Rs. " + balance);
        }
    }

    static void withdraw() {

        if (!accountCreated) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.print("Enter amount you want to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } 
        else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Remaining Balance: Rs. " + balance);
        }
    }

    static void transfer() {

        if (!accountCreated) {
            System.out.println("Please create an account first!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter receiver name: ");
        String receiverName = sc.nextLine();

        System.out.print("Enter amount you want to transfer: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } 
        else {
            balance -= amount;

            System.out.println("Rs. " + amount +
                    " transferred successfully to " + receiverName);

            System.out.println("Remaining Balance: Rs. " + balance);
        }
    }

    static void accountDetails() {

        if (!accountCreated) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("Balance: Rs. " + balance);
    }
}