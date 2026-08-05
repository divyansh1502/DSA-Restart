
import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Is your eye sight is good(yes/no): ");
        String s = sc.next().trim().toLowerCase();

        if(age >= 18 && s.equals("yes")) {
            System.out.println("Eligible for Driving License");
        } else {
            System.out.println("Not Eligible for Driving License");
        }
    }
}
