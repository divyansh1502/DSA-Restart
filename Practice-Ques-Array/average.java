
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size +  " elemnets: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Average: " + sum(arr,size));
    }
    static int sum(int[] arr, int size) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum/size;
    }
}


