
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight(kg): ");
        float w = sc.nextFloat();
        System.out.println("Enter your height(m): ");
        float h = sc.nextFloat();
        
        float bmi = w/(h*h);

        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal Weight");
        } else if(bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        System.out.printf("Your BMI is: %.2f" , bmi);
    }
}
