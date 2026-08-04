
import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        String ch = sc.next().toLowerCase();

    
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
