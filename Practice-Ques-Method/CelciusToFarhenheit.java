
import java.util.Scanner;

public class CelciusToFarhenheit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        float temp = sc.nextFloat();

        CtoF(temp);
    }
    static void CtoF(float c) {
        float f = c * (9f/5f) + 32;
        System.out.println("temperature in Farhenheit is : " + f);
    }
}
