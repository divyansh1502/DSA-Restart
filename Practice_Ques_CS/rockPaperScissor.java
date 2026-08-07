
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("R for Rock\nP for Paper\nS for Scissor");
        System.out.print("Enter a input: ");
        char user = sc.next().trim().toLowerCase().charAt(0);

        int computer = (int)(Math.random()*3);
        //0 --> Rock
        //1 --> Paper
        //2 --> Scissor
        if(computer == 0 && user == 'r') {
            System.out.println("Computer Choosed: Rock");
            System.out.println("Draw");
        } else if(computer == 0 && user == 'p') {
            System.out.println("Computer Choosed: Rock");
            System.out.println("User Wins");
        } else if(computer == 0 && user == 's') {
            System.out.println("Computer Choosed: Rock");
            System.out.println("Computer wins");
        } else if(computer == 1 && user == 'p') {
            System.out.println("Computer Choosed: Paper");
            System.out.println("Draw");
        } else if(computer == 1 && user == 's') {
            System.out.println("Computer Choosed: Paper");
            System.out.println("User wins");
        } else if(computer == 1 && user == 'r') {
            System.out.println("Computer Choosed: Paper");
            System.out.println("Computer wins");
        } else if(computer == 2 && user == 's') {
            System.out.println("Computer Choosed: Scissor");
            System.out.println("Draw");
        } else if(computer == 2 && user == 'r') {
            System.out.println("Computer Choosed: Scissor");
            System.out.println("User wins");
        } else if(computer == 2 && user == 'p') {
            System.out.println("Computer Choosed: Scissor");
            System.out.println("Computer wins");
        } else {
            System.out.println("Invalid input by user");
        }
    }
}
