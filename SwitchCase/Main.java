
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next().toLowerCase();

        switch(fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "grapes":
                System.out.println("Samll fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");

        }
    }
}