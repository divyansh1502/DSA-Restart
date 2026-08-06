
import java.util.Scanner;


public class stringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        System.out.println(greet(name));
    }
    static String greet(String name) {
        String msg = "Hello " + name;
        return msg;
    }
}
