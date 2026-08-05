
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float a = sc.nextFloat();

        float dis = 0;

        if( a > 5000) {
            dis = (a * 20) / 100;
        } else if(a >+ 2000 && a <= 5000) {
            dis = (a * 10) / 100;
        } else {
            dis = 0;
        }
        float total = a - dis;
        System.out.println("Discount you get is: " + dis);
        System.out.println("Total amount after discount: " + total);
    }
}
