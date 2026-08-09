
import java.util.Scanner;

public class FarhenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Farhenheit: ");
        float temp = sc.nextFloat();

        CtoF(temp);
    }
    static void CtoF(float f) {
        float c = (f - 32) * (5f/9f);
        System.out.print("Temperature in Celcius is: " + c);
    }
}
