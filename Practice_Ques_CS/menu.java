
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Sandwich");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Enter a valid number");


        }
    }
}
