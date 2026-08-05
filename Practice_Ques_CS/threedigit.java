
import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0) {
             n = n / 10;
            count++;
        }
        if(count == 3) {
            System.out.println("It's a 3 digit number");
        } else {
            System.out.println("It's not a 3 digit number");
        }
    }
}
