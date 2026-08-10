import java.util.Scanner;

public class searchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {14, 25, 36, 55, 94, 36, 1, 24, 75, 6};
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        searchTarget(arr,target);
    }
    static void searchTarget(int[] arr, int target) {
        boolean found = false;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Target Found at index number: " + i);
        }
        else {
            System.out.println("Target not found");
        }
        
    }
}
