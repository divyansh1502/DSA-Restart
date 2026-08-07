
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        HCF(a,b);
    }
    static void HCF(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            } else{
                y = y - x;
            }
        }
        System.out.println(x);

    }
}
