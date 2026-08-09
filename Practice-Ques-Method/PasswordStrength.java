
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String s = sc.next();

        checkStrength(s);
    }
    static void checkStrength(String pass) {
        int count = 0;
        if(pass.length() >= 8) {
            count++;
        }
        if(pass.length() >= 12) {
            count ++;
        }
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean specialChar = false;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                upper = true;
            }
            if(ch >= 'a' && ch <= 'z') {
                lower = true;
            }
            if(ch >= '0' && ch <= '9') {
                digit = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                specialChar = true;
            }
        }
        if(upper) count++;
        if(lower) count++;
        if(digit) count++;
        if(specialChar) count++;
        if(count <= 3) {
            System.out.println("Weak Password");
        } else if(count <=5) {
            System.out.println("Intermediate Password");
        } else if(count > 5) {
            System.out.println("Strong Password");
        }
    }
}
