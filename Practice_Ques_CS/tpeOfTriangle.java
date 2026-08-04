import java.util.Scanner;

public class tpeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st angle of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd angle of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd angle of triangle: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        if(sum == 180) {
            if(a == 60 && b == 60 && c == 60) {
                System.out.println("Equilateral Triangle");
            } else if(a == b || a == c || b == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }
        
         

    }
}
