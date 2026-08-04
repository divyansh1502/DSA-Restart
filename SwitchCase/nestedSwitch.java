
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        System.out.println("Enter employee ID: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        switch(n) {
            case 1:
                System.out.println("Divyansh Singh");
                break;
            case 2:
                System.out.println("Shagun Sahu");
                break;
            case 3:
                System.out.println("Employee no. 3");
                System.out.println("Enter Department: ");
                String department = sc.next();
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
        }
    }
}
