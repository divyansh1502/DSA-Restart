
import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {
        

        guess();
    }
    static void guess() {

        Scanner sc = new Scanner(System.in);

        int random = (int)(Math.random()* 100) + 1;
        boolean guessed = false;

        System.out.println("You have 6 lives: ");
        for (int i = 6; i >= 1; i--) {
            System.out.print("Enter a number(1-100): ");
            int n = sc.nextInt();

            if(n > random) {
                System.out.println("Your guess is too big! ");
            } else if(n < random) {
                System.out.println("Your guess is too small");
            } else if(n == random){
                System.out.println("Great You guessed Right: " + random);
                guessed = true;
                break;
            }
            System.out.println("Lives left: " + (i-1));
        }
        if(!guessed) {
            System.out.println("You Loose! Correct number is: " + random);
        }
    }
}
