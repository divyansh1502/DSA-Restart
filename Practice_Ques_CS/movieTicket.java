import java.util.Scanner;

public class movieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age > 0 && age < 120) {
        if(age <= 5) {
            System.out.println("Free Ticket");
        } else if(age >= 6 && age <= 12) {
            System.out.println("Rs. 100");
        } else if(age >= 1 && age <= 17) {
            System.out.println("Rs. 150");
        } else if(age >= 18 && age <= 59) {
            System.out.println("Rs. 250");
        } else {
            System.out.println("Rs.120 --> (Senior Citizen)");
        }
        } else {
            System.out.println("Enter a valid age");
        }
    }
}
