
import java.util.Scanner;


public class countDuplicate {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter target number: ");
        int target = sc.nextInt();
        
        int count = 0;
        while(n > 0) {
            int ld = n % 10;
            if(ld == target) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The occurenece of target " + target + " is: " + count );
    }
}
