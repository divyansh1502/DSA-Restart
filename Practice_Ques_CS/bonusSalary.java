
import java.util.Scanner;


public class bonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int sal = sc.nextInt();
        System.out.println("Enter the year of Experience: ");
        int exp = sc.nextInt();

        if(exp > 20) {
            sal += 10000;
            System.out.println("Total Salary with bonus: " + sal);
        } else if(exp >= 15 && exp <= 20) {
            sal += 8000;
            System.out.println("Total Salary with bonus: " + sal);
        } else if(exp >= 10 && exp < 15) {
            sal += 6000;
            System.out.println("Total Salary with bonus: " + sal);
        } else if(exp >= 5 && exp < 10) {
            sal += 4000;
            System.out.println("Total Salary with bonus: " + sal);
        } 
        else {
            sal += 2000;
            System.out.println("Total Salary with bonus: " + sal);
        }
    }
}
