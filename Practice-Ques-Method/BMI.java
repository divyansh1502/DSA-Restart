
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight(kg): ");
        float w = sc.nextFloat();
        System.out.print("Enter your Height(m): ");
        float h = sc.nextFloat();

        BMI(w,h);
    }
    static void BMI(float w, float h) {
        float bmi = w / (h* h);
        System.out.println("BMI: " + bmi);
    }
}
