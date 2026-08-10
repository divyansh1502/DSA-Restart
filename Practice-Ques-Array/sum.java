import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 elemnets: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum: " + sum(arr));
    }
    static int sum(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }
}
