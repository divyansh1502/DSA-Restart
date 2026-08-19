import java.util.Arrays;

public class LC1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            newArr[2 * i] = nums[i];
            newArr[2 * i + 1] = nums[n + i]; 
        }
        return newArr;
    }
}
