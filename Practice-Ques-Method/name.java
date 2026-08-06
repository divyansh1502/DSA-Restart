
import java.util.Scanner;


public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();

        fun(name);
    }
    static void fun(String name) {
        System.out.println("Hello " + name);
    }
}
