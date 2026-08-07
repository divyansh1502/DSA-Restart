
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String un = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if(un.equals("divyansh_5ingh")) {
            if(pass.equals("Yashu@1234")) {
                System.out.println("Login Successfully");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Wrong Username");
        }
        
    }
}
