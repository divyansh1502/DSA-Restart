
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Grade: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch(ch) {
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Good");
                break;
            case 'c':
                System.out.println("Average");
                break;
            case 'd':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter a valid Grade");
        }
    }
}
