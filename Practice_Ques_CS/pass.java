
import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        System.out.print("Maths: ");
        int a = sc.nextInt();
        System.out.print("Physics: ");
        int b = sc.nextInt();
        System.out.print("Chemistry: ");
        int c = sc.nextInt();
        System.out.print("English: ");
        int d = sc.nextInt();
        System.out.print("Biology: ");
        int e = sc.nextInt();

        int sum = a + b + c + d + e;

        float percentage = (sum/500.0f)*100;

        if(a >= 33 && b >= 33 && c >= 33 && d >= 33 && e >= 33 && percentage >= 40) {
            System.out.println("Pass");
            System.out.println("Percentage: " + percentage + "%");
        } else {
            System.out.println("Fail");
            System.out.println("Percentage: " + percentage + "%");
        }
    }
}
