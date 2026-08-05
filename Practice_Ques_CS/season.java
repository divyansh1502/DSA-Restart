
import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        switch(month) {
            case 11,12,1,2,3:
                System.out.println("Winterrrrr...");
                break;
            case 4,5,6,7:
                System.out.println("Summerrrrr...");
                break;
            case 8,9,10:
                System.out.println("Rainyyy...");
                break;
            default:
                System.out.println("Enter a valid Number!");
        }
    }
}
