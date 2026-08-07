import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.print("Enter the Temperature: ");
        Scanner sc = new Scanner(System.in);
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Farhenheit: " + tempF);
    }
}
