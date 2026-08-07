
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        LCM(a,b);
    }
    static void LCM(int x, int y) {
        int lcm = Math.max(x,y);

        while(true) {
            if(lcm % x == 0 && lcm % y == 0) {
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }
    }
}
