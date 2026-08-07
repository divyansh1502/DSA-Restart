
import java.util.Scanner;

public class restaurantBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:\n1.Burger: Rs.120\n2.Pizza: Rs.250\n3.Pasta: Rs.180\n4.Sandwich: Rs.100\n5.Coke: Rs.60");
        System.out.print("Enter the name of item: ");
        String order = sc.next().toLowerCase();
        System.out.print("Enter the quantity: ");
        int n = sc.nextInt();

        float rawBill = 0;
        switch(order) {
            case "burger":
                rawBill = 120 * n;
                break;
            case "pizza":
                rawBill = 250 * n;
                break;
            case "pasta":
                rawBill = 180 * n;
                break;
            case "sandwich":
                rawBill = 100 * n;
                break;
            case "coke":
                rawBill = 60 * n;
                break;
            default:
                System.out.println("Inavlid item Please check menu again!");
        }
        
        float disBill = 0;
        if(rawBill >= 1000) {
            disBill = (rawBill * 20) / 100;
            rawBill = rawBill - disBill;
        } else if(rawBill >= 500 && rawBill < 1000) {
            disBill = (rawBill * 10) / 100;
            rawBill = rawBill - disBill;
        } else {
            rawBill = rawBill;
        }
        float gstBill = (rawBill * 105) / 100;
        System.out.println("Discount: " + disBill);
        System.out.println("Total Bill: " + gstBill);

    }
}
